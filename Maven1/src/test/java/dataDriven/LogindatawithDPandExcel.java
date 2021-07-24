package dataDriven;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogindatawithDPandExcel {
	WebDriver driver;
	
	@DataProvider(name="datas")
	public Object [][] dataProviderMethod() throws IOException {
		
//		 Object [][] logindatas={
//			{"Admin","admin123wrong","valid"},
//			{"Adminwrong","admin123","Invalid"},
//			{"Admin","admin123","Invalid"},
//			{"Adminwrong","admin123wrong","Invalid"}
//		};
		
//		read from excel
		
		String path = "C:\\Users\\admin\\eclipse-workspace\\Maven1\\TestData\\Book1.xlsx";
		XLUtility utility = new XLUtility(path);
		int rowCount = utility.getRowCunt("Sheet1");
		int cellCount = utility.getCellCount("Sheet1",1);
		
		String logindatas[][] = new String[rowCount][cellCount];
		
		for(int r=1; r<rowCount; r++) {
			for(int c=0; c<cellCount;c++) {
				 logindatas[r-1][c] =utility.getCellData("Sheet1", r, c);
				
			}
		}
		

		return logindatas;
	}
	
	
	
	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		   driver = new ChromeDriver();
		
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void closeDriver() {
		
		driver.close();
	}
	
	
	@Test(dataProvider = "datas")
	public void loginWithCorrectUsername(String s1, String s2) {
		
	
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys(s1);
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.sendKeys(s2);
	
		}
		
}	
