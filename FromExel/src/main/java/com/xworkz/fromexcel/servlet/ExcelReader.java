package com.xworkz.fromexcel.servlet;

import com.xworkz.fromexcel.service.FromExcelService;
import com.xworkz.fromexcel.service.FromExcelServiceImp;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/upload")
@MultipartConfig
public class ExcelReader extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        FromExcelService fromExcelService=new FromExcelServiceImp();

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
            int count =0;
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i); // Get each row
                if (row == null) continue;
//                String date = row.getCell(0).getStringCellValue();
//                String name = row.getCell(1).getStringCellValue();
//                int amount = (int) row.getCell(2).getNumericCellValue();
                String name = row.getCell(0) != null ? row.getCell(0).toString() : "";
                String email = row.getCell(1) != null ? row.getCell(1).toString() : "";

                if (!name.isEmpty() && !email.isEmpty()) {
                    count ++;
                    System.out.println("Sending mail to: "+ count +"|"+ name + " | " + email);
                    String result = fromExcelService.sendOtpToMAil(email);
                    System.out.println("Status: " + result);
                }
            }
            workbook.close();
            inputStream.close();
            System.out.println("-----------------------");

        } catch (Exception e) {
        }
    }
}
