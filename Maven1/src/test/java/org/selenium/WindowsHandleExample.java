package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String parentWindow=driver.getWindowHandle(); //value of parent window
		
		WebElement openHomePage= driver.findElement(By.id("home"));
		openHomePage.click();
		
		Set<String> parentChildWindows =driver.getWindowHandles(); //value of parent and childwindow
		//giving access to child window
		for (String newWindow : parentChildWindows) {
			driver.switchTo().window(newWindow);
		}
		
		//finding element in child window
		WebElement clickEdit= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		Thread.sleep(3000);
		clickEdit.click();
		Thread.sleep(3000);
		driver.close(); 
		
		// switch window access from child to parent
		driver.switchTo().window(parentWindow);
		//or
		//driver.switchTo().defaultContent();
		Thread.sleep(3000);

		
		//Find the number of opened windows
		//WebElement numberOFOpenedWindow= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		WebElement numberOFOpenedWindow= driver.findElement(By.id("color"));

		
		numberOFOpenedWindow.click();
		Set<String> newWindowHandles =driver.getWindowHandles();
		int size=newWindowHandles.size();
		System.out.println(size);    //ans =3 parent+child window
		
		for (String allWindows : newWindowHandles) {    //iterate apdina first parent window so no if condition work //then child window condition satisfy agum so if condition work agum 
			if (!allWindows.equals(parentWindow)) {      //parent window thavara ella window uh close panna sola condition  
				driver.switchTo().window(allWindows);
				Thread.sleep(3000);

				driver.close();
				
				
			}
				
			
			
		}
		
		
		
		
		
		
		
		
	}

}
