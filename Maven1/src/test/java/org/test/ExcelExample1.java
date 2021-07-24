package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;

public class ExcelExample1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\Book1.xlsx");
		 FileInputStream inputStream = new FileInputStream(file);
		 XSSFWorkbook book = new XSSFWorkbook(inputStream);
		 XSSFSheet sheet= book.getSheet("Sheet1");
		 
		 for (int r=0; r<sheet.getPhysicalNumberOfRows(); r++) {
			 
			XSSFRow row = sheet.getRow(r);
			 
		 
			 for(int c=0; c<row.getPhysicalNumberOfCells(); c++) {
				 
				 Cell cell = row.getCell(c);
				 
				 
				 
				 int cellType = cell.getCellType();
				 
				 
				 
				 if(cellType==1) {
					 System.out.println(cell.getStringCellValue());
					 
				 }else  {
					 System.out.println(cell.getNumericCellValue());
					 
				 }
				 
				 
			 
			 }
		 

		 }
	}
}
