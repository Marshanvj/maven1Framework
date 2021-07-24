package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement simpleAlert= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		simpleAlert.click();
		Alert clickAlert1=driver.switchTo().alert();
		Thread.sleep(3000);
		clickAlert1.accept();
		
		WebElement confirmAlert= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmAlert.click();
		
		Alert clickAlert2 =driver.switchTo().alert();
		Thread.sleep(3000);
		clickAlert2.accept();
		Thread.sleep(3000);
		confirmAlert.click();
		Thread.sleep(3000);
		clickAlert2.dismiss();
		
		WebElement promptAlert= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptAlert.click();
		
		Alert clickAlert3=driver.switchTo().alert();
		clickAlert3.sendKeys("Thanks");
		Thread.sleep(3000);

		clickAlert3.accept();
		
		
		
		
	}

}
