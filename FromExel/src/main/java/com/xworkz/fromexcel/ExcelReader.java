package com.xworkz.fromexcel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/upload")
@MultipartConfig
public class ExcelReader extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            Part filePart = request.getPart("file"); // Get uploaded file
            InputStream inputStream = filePart.getInputStream(); // Get input stream

            Workbook workbook = new XSSFWorkbook(inputStream); // For .xlsx files
            Sheet sheet = workbook.getSheetAt(0); // Get first sheet

            System.out.println("---- Excel Content ----");
//            for (Row row : sheet) {
//                StringBuilder rowText = new StringBuilder();
//                for (Cell cell : row) {
//                    rowText.append(cell.toString());//.append(" | ")
//                }
//                System.out.println(rowText.toString());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Skip header row (i=1)
                Row row = sheet.getRow(i); // Get each row
                if (row == null) continue;

                // Extract Name, Age, Gender assuming they are in first 3 columns (0,1,2)
                Date date = row.getCell(0).getDateCellValue();
                String name = row.getCell(1).getStringCellValue();
                int amount = (int) row.getCell(2).getNumericCellValue();
                String formatedDate=dateFormat.format(date);

                System.out.println("Date: "+formatedDate +" | "+ "Name: " + name + " | "+"Amount:" + amount);
                workbook.close();
                inputStream.close();
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
        }
    }
}
