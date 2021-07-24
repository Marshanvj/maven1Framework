package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {
	
	
	String path;
	
	
	
	
	public XLUtility(String path) {
		this.path=path;

	}

	
	public int getRowCunt(String sheetName) throws IOException {
		FileInputStream fi = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		fi.close();
		
		return rowCount;
	}
	
	
	public int getCellCount(String sheetName, int rownum) throws IOException {
		FileInputStream fi = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rownum);
		int cellCount = row.getPhysicalNumberOfCells();
		fi.close();
		
		return cellCount ;
	}
	
	public String getCellData(String sheetName,int rownum,int colnum) throws IOException {
		FileInputStream fi = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rownum);
		XSSFCell cell = row.getCell(colnum);
		
		DataFormatter formatter = new DataFormatter();
		
		String data;
		try {
			 data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data="";
		}
		fi.close();
		
		return data;
		
	}
	
	
}
