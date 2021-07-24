package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectPassword {
	
	@Test
	@Parameters({"Username","Password"})
	public void loginWithCorrectPassword(String s1, String s2) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys(s1);
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.sendKeys(s2);
		
		
		
	}

}
