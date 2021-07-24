package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	static WebElement webelement=null;
	
	// username
	//password
	//loginButton
	
	public static WebElement userName(WebDriver driver) {
		
		 webelement=driver.findElement(By.name("username"));
		 return webelement;
		
	}

	public static WebElement password(WebDriver driver) {
		
		webelement=driver.findElement(By.name("password"));
		return webelement;
		
	}
	
	public static WebElement loginButton(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
		
	}
	
}

//	public static WebElement username(WebDriver driver) {
//		return driver.findElement(By.name("username"));
//		
//	}
//
//	
//	public static WebElement password(WebDriver driver) {
//		return driver.findElement(By.name("password"));
//		
//	}
//	
//	
//	public static WebElement loginButton(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
//		
//	}







 