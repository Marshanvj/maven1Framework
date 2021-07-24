package org.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataFetch {

	public static void main(String[] args) throws IOException {
		
	String file=("C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\testdata.xlsx");
	
	FileInputStream inputStream= new FileInputStream(file);
	Workbook book = new XSSFWorkbook(inputStream);
	book.getSheet("Sheet1");
		
		System.out.println("done");

	}

}
