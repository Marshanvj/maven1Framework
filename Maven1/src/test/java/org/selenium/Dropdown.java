package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		Select select1=new Select(dropdown1);
		select1.selectByIndex(2);
		
		WebElement dropdown2= driver.findElement(By.name("dropdown2"));
		Select select2=new Select(dropdown2);
		select2.selectByVisibleText("UFT/QTP");
		
		WebElement dropdown3=driver.findElement(By.id("dropdown3"));
		Select select3= new Select(dropdown3);
		select3.selectByValue("4");
		
	    WebElement dropdown4= driver.findElement(By.className("dropdown"));
	    Select select4=new Select(dropdown4);
	    List<WebElement> option= select4.getOptions();
	    
	    int size=option.size();
	    
	    System.out.println(size);
	    
	    for (int i = 0; i < size; i++) {
	    	System.out.println(i);
			
	    WebElement dropdown5= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	    dropdown5.sendKeys("Loadrunner");
	    
	    WebElement dropdown6= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select6=new Select(dropdown6);
		select6.selectByIndex(2);
		select6.selectByIndex(3);
		select6.selectByIndex(4);
	
		}
	    
	    
	     
		
	
		
	
	}

}
