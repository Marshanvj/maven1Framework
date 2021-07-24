package org.selenium;

import java.util.List;

import org.base.LibGlobal; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutoCompleteExample extends LibGlobal{

	public static void main(String[] args) throws InterruptedException {

		LibGlobal global = new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("http://www.leafground.com/");
		
		global.findBy("xpath", "//*[text()='Auto Complete']").click();
		
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("c");
		
		Thread.sleep(4000); // why thread.sleep()?  =element in the list has to find the keywords
		
		List<WebElement> items =driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		int size=items.size();
		
		System.out.println(size);
		// method 1 using Actions class
//		Actions action=new Actions(driver);
//		action.click(items.get(2)).build().perform();
		
		//using iteration method for each loop why? best practice is o take the list item with text instaed of index
		for (WebElement webElement : items) {
			
			if (webElement.getText().equals("Cucumber")) {
				webElement.click();
				
				
			}
			
			
			
		}
		
		
		
	}

}
