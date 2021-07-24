package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class TestMaven1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\testdata.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileInputStream);
		Sheet sheet= book.getSheet("Sheet1");
		
			Row row = Sheet.getRow(3);
		
		
		
		
	}

}
