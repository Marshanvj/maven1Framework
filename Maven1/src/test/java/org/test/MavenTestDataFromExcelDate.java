package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenTestDataFromExcelDate {

	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\testdata.xlsx");
		FileInputStream inputStream= new FileInputStream(file);
		Workbook book=new XSSFWorkbook(inputStream);
		Sheet sheet=book.getSheet("Sheet1");
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {        // finding how many rows are there in excel
			Row row=sheet.getRow(i);								//selecting row
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {		//find number of cells in a row
				Cell cell= row.getCell(j);                          //selecting cell
				
				int cellType=cell.getCellType();                    //gettimg the type of cell with 0 and 1s
				
				if(cellType==1) {
					String stringValue=cell.getStringCellValue();
					System.out.print(stringValue);
					System.out.println();
					}else if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue=cell.getDateCellValue();   //Mon Dec 13 00:00:00 GMT-12:00 2021
						
						SimpleDateFormat dateFormat= new SimpleDateFormat("mmm/dd/yyyy");
						String myFormat=dateFormat.format(dateCellValue);
						System.out.println(myFormat);
						
					}
					else{
					double cellValue=cell.getNumericCellValue();
					long l=(long)cellValue;
 System.out.println(l); 
 
					}
			}
			
		}
		
	}
 
}
