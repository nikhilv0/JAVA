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

            for (int i = 2; i <= sheet.getLastRowNum(); i++) { // Skip header row (i=1)
                Row row = sheet.getRow(i); // Get each row
                if (row == null) continue;

//                String date = row.getCell(0).getStringCellValue();
//                String name = row.getCell(1).getStringCellValue();
//                int amount = (int) row.getCell(2).getNumericCellValue();

                String date = "";
                String name = "";
                int amount = 0;
                if (row.getCell(0) != null) {
                    date = row.getCell(0).toString(); // works for both string/date cells
                }
                if (row.getCell(1) != null) {
                    name = row.getCell(1).toString();
                }
                if (row.getCell(2) != null) {
                    try {
                        amount = (int) row.getCell(2).getNumericCellValue();
                    } catch (Exception e) {
                        amount = 0;
                    }
                }


                System.out.println("Date: "+date +" | "+ "Name: " + name + " | "+"Amount:" + amount);
                workbook.close();
                inputStream.close();
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
        }
    }
}
