package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement iframe1= driver.findElement(By.id("Click"));
		iframe1.click();
		
		String gettingTextFromIFrame=driver.findElement(By.id("Click")).getText();
		System.out.println(gettingTextFromIFrame);
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement nestediframe2=  driver.findElement(By.id("Click1"));
		nestediframe2.click();
		String gettingText=driver.findElement(By.id("Click1")).getText();
		
		System.out.println(gettingText);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> findFrames= driver.findElements(By.tagName("iframe")); // will retr the number of iframe tages inside the native html code 
	
		int findSize =findFrames.size();
		 System.out.println("The number of iframe Inside the html is : "+findSize);
		 
		 System.out.println("done!!!");
		
		
	}

}
