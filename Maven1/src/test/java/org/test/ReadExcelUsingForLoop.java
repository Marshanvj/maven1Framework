package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUsingForLoop {

	

	public static void main(String[] args) throws IOException {

		File filePath = new File("C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\testdata.xlsx");
		
		FileInputStream inputStream = new FileInputStream(filePath);
		
		XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
		
		XSSFSheet sheet = workBook.getSheetAt(0);
		
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<=rowCount; r++) {
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0; c<=columnCount; c++) {
				XSSFCell cell = row.getCell(c);
				
				int cellType = cell.getCellType();
				
				if(cellType==1) {
					String cellValue=cell.getStringCellValue();
					System.out.println(cellValue);
					
				}else {
					double numberCellValue=cell.getNumericCellValue();
					
					//int l= (int)numberCellValue;
					long aa= (long)numberCellValue;
					
					System.out.println(aa);
				}
					
				}
					
					
					
				}
				
			}
			
		}
		
		
		
		
	


