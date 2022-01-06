package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	private static void particular_Data() throws IOException {
		File f = new File("C:\\Users\\jancy\\eclipse-workspace\\MavenProject\\Excel\\user.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);

		}

	}

	private static void all_Data() throws IOException {
		File f = new File("C:\\Users\\jancy\\eclipse-workspace\\MavenProject\\Excel\\user.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;
					System.out.println(value);

				}

			}

		}

	}

	private static void test_Case() throws IOException {
File f=new File("C:\\Users\\jancy\\OneDrive\\Documents\\Course\\Test case for My Store-Jancy.xlsx");
FileInputStream fis=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fis);
Sheet sheetAt = wb.getSheetAt(0);
Row row = sheetAt.getRow(19);
Cell cell = row.getCell(6);
Row row2 = sheetAt.getRow(19);
Cell cell2 = row2.getCell(7);
String cellType = cell.getStringCellValue();
String cellType2 = cell2.getStringCellValue();
System.out.println(cellType +"  "+ cellType2);

	}
	public static void main(String[] args) throws IOException {
		particular_Data();
		all_Data();
		test_Case();
	}

}
