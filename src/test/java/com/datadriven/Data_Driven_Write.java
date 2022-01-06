package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Write {
 private static void write() throws IOException {
File f=new File("C:\\Users\\jancy\\OneDrive\\Desktop\\user.xlsx");
FileInputStream fis=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fis);
wb.createSheet("Data").createRow(0).createCell(0).setCellValue("S. Name");
wb.getSheet("Data").getRow(0).createCell(1).setCellValue("S. ID");
wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Jancy");
wb.getSheet("Data").getRow(1).createCell(1).setCellValue("1234");

FileOutputStream fos=new FileOutputStream(f);
wb.write(fos);
wb.close();

System.out.println("Write successfully");
}
 
 
 public static void main(String[] args) throws IOException {
	write();
}
}
