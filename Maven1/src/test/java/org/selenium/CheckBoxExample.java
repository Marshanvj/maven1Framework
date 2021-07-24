package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		//Select the languages that you know?
		WebElement javaCheckBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		javaCheckBox.click();
		WebElement sqlCheckBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[3]/input"));
		sqlCheckBox.click();
		
		//Confirm Selenium is checked
		WebElement confirmCheckBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean selectOrNOt=confirmCheckBox.isSelected();
			if (selectOrNOt==true) {	
				System.out.println("selenium is selected");
			}else {
				System.out.println("selenium is not selected");
			
		//DeSelect only checked
		WebElement deSelect= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		
		if (deSelect.isSelected()) {
			
		deSelect.click();
			
		}else {
			System.out.println("a");
		}
		
			}}}  
	
	


