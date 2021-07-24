package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePageObjects {
	
	//nav-link go-text-right active
	
	public static WebElement myProfileClick(WebDriver driver) {
		
		return driver.findElement(By.className("nav-item"));
		
		//driver.findElements(By.xpath("");
		
		// /html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]
		
		//html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a
	}
	
	
	
	

}
