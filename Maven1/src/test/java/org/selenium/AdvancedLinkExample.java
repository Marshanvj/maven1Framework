package org.selenium;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdvancedLinkExample extends LibGlobal{

	public static void main(String[] args) throws InterruptedException {
		
LibGlobal global= new LibGlobal();
		
		global.getDriver("chrome");
		driver.navigate().to("http://www.leafground.com/pages/Link.html");		

		WebElement homepage= global.findBy("xpath", "//a[text()='Go to Home Page']");
		homepage.click();

		WebElement firstLink= global.findBy("xpath", "(//*[@href])[8]");
		firstLink.click();

		

		
		WebElement secondLink=global.findBy("xpath", "(//a[@href])[3]");
		String pageSource=secondLink.getAttribute("href");
		System.out.println(pageSource);

		WebElement thirdLink = driver.findElement(By.xpath("(//a[@href])[4]"));
		thirdLink.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.navigate().back();
		
		//homepage.click();       StaleElementException
		
		global.findBy("xpath", "//*[@id=\"contentblock\"]/section/div[4]/div/div/a").click();
		
    	WebElement q= global.findBy("xpath", "(//*[@href])[8]");
		q.click();
		
//		firstLink.click();
		
		
		List<WebElement> hrefLink=driver.findElements(By.tagName("a"));
		int size=hrefLink.size();
		System.out.println(size);
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/a")).click();
		Thread.sleep(4000);
		
		List<WebElement> hrefLink2=driver.findElements(By.tagName("a"));
		int size2=hrefLink2.size();
		System.out.println(size2);
		
		
		
		
		
		
		
		
		

	}

}
