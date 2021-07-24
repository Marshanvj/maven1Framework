package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOrdersIntoExcel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_EAIaIQobChMIqNrop7Or8QIV35VLBR1AgQmLEAAYASAAEgJiK_D_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIqNrop7Or8QIV35VLBR1AgQmLEAAYASAAEgJiK_D_BwE");
		String title= driver.getTitle();
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(title);
		WebElement searchTextBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("iphone",Keys.ENTER);
		System.out.println("done!!");
		
	}

}
