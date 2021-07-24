package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MavenTestdataFromExcel {

	public static void main(String[] args) throws IOException {
		String filePath ="C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\testdata.xlsx";
		File file = new File(filePath);
		
		FileInputStream inputStream= new FileInputStream(file);
		Workbook book = new XSSFWorkbook(inputStream);
		Sheet sheet = book.getSheet("Sheet1");
	
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				
				int cellType=cell.getCellType();
				 
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
		
		System.out.println("done!!");
	}

}
