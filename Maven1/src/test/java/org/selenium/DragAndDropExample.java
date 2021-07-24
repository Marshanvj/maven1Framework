package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		//Actions class
		Actions action= new Actions(driver); //pass webdriver driver in Action class
		
		//perform action using method 1------------->slow
		//action.clickAndHold(source).moveToElement(target).build().perform();
		
		//perform action using method2------------->fast
		action.dragAndDrop(source, target).build().perform();
		
		// buils and perform is necessary to perform the action using action class
		
		
	}

}
