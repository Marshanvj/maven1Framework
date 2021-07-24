package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAndExcelUsingTestNG {
	
	
	
	
	@DataProvider(name="testdata")
	public void dataProviderExcel() {
		
		
	}
	
	public void getExcelDta() throws IOException {
		
		List<String> usernamelist = new ArrayList<String>();
		List<String> passwordlist = new ArrayList<String>();
		
		
		FileInputStream inputFileInputStream = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(inputFileInputStream);
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();
			
			Iterator<Cell> cellIterator= rowValue.iterator();
			
			int i=2;
			while(cellIterator.hasNext()) {
				
				if(i%2==0) {
					usernamelist.add(cellIterator.next().getStringCellValue());
					passwordlist.add(cellIterator.next().getStringCellValue());

				}
				
			}i++;
			
			
			
			
			
		}
		
		
			
		
		
		
	}
	
	
	@Test(dataProvider ="testdata")
	public void loginData() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("");
	
	}

}
