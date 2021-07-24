package dataDriven;


	
	import java.io.FileInputStream;
	 
	 import java.io.FileNotFoundException;
	 
	 import java.io.FileOutputStream;
	 
	 import java.io.IOException;
	 
	 import org.apache.poi.xssf.usermodel.XSSFCell;
	 
	 import org.apache.poi.xssf.usermodel.XSSFRow;
	 
	 import org.apache.poi.xssf.usermodel.XSSFSheet;
	 
	 import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	 
	 public class ExcelDataprovider {
	 
	 private static XSSFSheet ExcelWSheet;
	 
	 private static XSSFWorkbook ExcelWBook;
	 
	 private static XSSFCell Cell;
	 
	 private static XSSFRow Row;
	 
	 
	 public static Object[][] getTableArray() throws Exception {   
	 
	    String[][] twoDimArray = null;
	 
	    
	   
	    String FilePath1 = "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Maven1\\\\TestData\\\\testdata.xlsx";
	 
	    FileInputStream ExcelFile = new FileInputStream(FilePath1);
	 
	    XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
	 
	    XSSFSheet ExcelWSheet = ExcelWBook.getSheetAt(0);
	 
	    int startRow = 1;
	 
	    int startCol = 1;
	 
	    int ci,cj;
	 
	    int totalRows = ExcelWSheet.getLastRowNum();
	 
	    // you can write a function as well to get Column count
	 
	    int totalCols = 2;
	 
	    twoDimArray=new String[totalRows][totalCols];
	 
	    ci=0;
	 
	    	for (int i=startRow;i<=totalRows;i++, ci++) {              
	 
	    		cj=0;
	 
	    		for (int j=startCol;j<=totalCols;j++, cj++){
	 
	    			twoDimArray[ci][cj]=getCellData(i,j);
	 
	    				System.out.println(twoDimArray[ci][cj]); 
	    				
	            }
	 
	        }
			return twoDimArray;
	 
	 }
	 

	 
	 public static String getCellData(int RowNum, int ColNum) throws Exception {
	 
	 
	 
	 Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	 
	 int dataType = Cell.getCellType();
	 
	 if  (dataType == 3) {
	 
	 return "";
	 
	 }else{
	 
	 String CellData = Cell.getStringCellValue();
	 
	 return CellData;
	 
	 }
	 
	 }
	 
	 } 
	 
	 
	 


