package org.testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchBrowserWithSiute {
	
	WebDriver driver;
	long startTime;
	
	
	//1.launch browser
	//2.go to google,bing,yahoo website using chrome browser
	//3. exit browser
	
	
	@BeforeSuite
	public void chromeLaunch() {
		 startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	@Test(enabled = true)
	public void googleWebsite() {
		//long startTime=System.currentTimeMillis();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		System.out.println("google launched");
		
		long endTime=System.currentTimeMillis();
		
		long totalTime= endTime-startTime;
		System.out.println("Total time :"+totalTime);
		
	}
	
	@Test(dependsOnMethods = "googleWebsite")
	public void bingWebsite() {
		//long startTime=System.currentTimeMillis();
		
		driver.get("https://www.bing.com/");
		System.out.println("bing launched");
		
		long endTime=System.currentTimeMillis();
		long totalTime= endTime-startTime;
		System.out.println("Total time :"+totalTime);
		
	}
	
	@Test(enabled =false,dependsOnMethods="bingWebsite")    //this test wont run  
	public void yahooWebsite() {
		//long startTime=System.currentTimeMillis();
		
		driver.get("https://in.yahoo.com/");
		System.out.println();
		
		long endTime=System.currentTimeMillis();
		long totalTime= endTime-startTime;
		System.out.println("Total time :"+totalTime);
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();

	}
	

}
