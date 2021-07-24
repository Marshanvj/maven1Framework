package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteData {

	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\testdata.xlsx");
		FileInputStream inputStream= new FileInputStream(file);
		Workbook book= new XSSFWorkbook(inputStream);
		Sheet sheet=book.getSheet("Sheet1");
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row=sheet.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cells=row.getCell(j);
				
				int cellType=cells.getCellType();
				
				if(cellType==1) {
					String a=cells.getStringCellValue();
					System.out.println(a);
				}else if(DateUtil.isCellDateFormatted(cells)){
					
					Date date=(Date) cells.getDateCellValue();
					//Date date=(Date) cells.getDateCellValue();
					//Date dateCellValue=cell.getDateCellValue();
					System.out.println("date");
					
					
					
				}else {
					double d=cells.getNumericCellValue();
							System.out.println(d);
				}
			}
		}
		

	}

}
