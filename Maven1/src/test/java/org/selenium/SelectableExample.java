package org.selenium;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample  extends LibGlobal{

	public static void main(String[] args)  {
		
		LibGlobal global=new LibGlobal();
		global.getDriver("CHROME");
		global.launchUrl("http://www.leafground.com/");
		
		WebElement selectable=global.findBy("xpath", "//*[text()='Selectable']");
		selectable.click();
		
		List< WebElement > items= driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int itemsSize=items.size();
		System.out.println(itemsSize);
		
		
		//checking all selectable one by one
		
		/*
		 for (int i= 0; i < itemsSize; i++) {
			items.get(i).click();
				
		}
		*/
		
		//selecting using contol button and click
		/*
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(items.get(0)).
		click(items.get(1)).build().perform();                //whenever i use actions shound use build().peform();
		--------------------------------------------
		*/
		
		Actions action=new Actions(driver);
		action.clickAndHold(items.get(0)).click(items.get(1)).build().perform();

		
		
		
		
		
	}

}
