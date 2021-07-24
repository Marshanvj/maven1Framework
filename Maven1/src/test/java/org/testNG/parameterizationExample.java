package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationExample {
	
	@Test
	@Parameters({"Username","Password"})
	public void fbLogin(String s1, String s2) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Maven1\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
	}
	
	
	
	

}
