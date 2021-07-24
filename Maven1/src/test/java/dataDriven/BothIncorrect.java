package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BothIncorrect {
	@Test
	@Parameters({"Username","Password"})
	public void loginWithBothIncorrect(String usrname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys(usrname);
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.sendKeys(pwd);
		
		
	}
}
