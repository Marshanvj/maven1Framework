package dataDriven;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;
	
	@DataProvider(name="datas")
	public Object [][] dataProviderMethod() {
		
		 Object [][] logindatas={
			{"Admin","admin123wrong","InValid"},
			{"Adminwrong","admin123","Invalid"},
			{"Admin","admin123","valid"},
			{"Adminwrong","admin123wrong","Invalid"}
		};
		
		return logindatas;
	}
	
	
	
	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		   driver = new ChromeDriver();
		
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void closeDriver() {
		
		driver.close();
	}
	
	
	@Test(dataProvider = "datas")
	public void loginWithCorrectUsername(String s1, String s2, String res) {
		
	
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys(s1);
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.sendKeys(s2);
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		
		}
		
}	

