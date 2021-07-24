package org.automate;

import org.base.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.LoginPageObjects;
import org.pom.MyProfilePageObjects;

public class PhpTravel extends LibGlobal {

	public static void main(String[] args)  {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		//driver.get("https://www.phptravels.net/login");
		
		
		  LibGlobal global=new LibGlobal(); 
		  global.getDriver("chrome");
		  global.launchUrl("https://www.phptravels.net/login");
		  
		  
		 
		
		//LOGIN_PAGE_OBJECTS
		 // LoginPageObjects loginPageObjects = new LoginPageObjects();
		  LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		  LoginPageObjects.password(driver).sendKeys("demouser");
		  LoginPageObjects.loginButton(driver).click();
		  
		//my profile page
		  
		  MyProfilePageObjects.myProfileClick(driver).click();
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	    /*
		 * driver.findElement(By.name("username"));
		 * driver.findElement(By.name("password"));
		 * driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
		 */
		
		/*
		 * driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		 * global.findBy("name", "password").sendKeys("demouser");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
		 */
		
		
		
		
		
		

		
	}

}
