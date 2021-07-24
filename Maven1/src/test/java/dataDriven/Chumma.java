package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Chumma {
	
	@Test
	public void tc01() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys("Admin");
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String title = driver.getTitle();
		System.out.println(title);//OrangeHRM
		
		 driver.findElement(By.id("welcome")).click();
		 driver.findElement(By.linkText("Logout")).click();
		
		
		
		
	}

}
