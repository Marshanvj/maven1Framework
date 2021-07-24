package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//find the co ordinates of the button position
		WebElement button= driver.findElement(By.id("position"));
		Point xy = button.getLocation();
		int a=xy.getX();
		int b =xy.getY();
		
		System.out.println("x is in "+a + " | " + "y is in "+b);
		
		//find the color of the button
		WebElement color= driver.findElement(By.xpath("//*[@id=\"color\"]"));
		String str=color.getCssValue("background-color");
		System.out.println(str);
		
		//size of the elemet
		
		WebElement size= driver.findElement(By.id("size"));
		int height =size.getSize().getHeight();
		int width = size.getSize().getWidth();
		
		System.out.println("height is "+height +" | "+"width is "+width);
		
		WebElement home= driver.findElement(By.id("home"));
		home.click();
		driver.close();
		
		System.out.println("done!!");
		
	
	}

}
