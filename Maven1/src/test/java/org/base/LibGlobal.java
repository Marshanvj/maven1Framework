package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class LibGlobal {
			public static WebDriver driver;
			
			//launch chrome
			public void getDriver(String browserName) {
				try {
					if (browserName.equalsIgnoreCase("Chrome")) {
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
						driver=new ChromeDriver();		
					}
					
				} catch (Exception e) {
					System.out.println(e);		
					}					
			
		}
	//enter url method	
	public void launchUrl(String url) {
				try {
					driver.get(url);
				} catch (Exception e) {
					System.out.println(e);	
					}	
	}
	
	//findBy method
	public WebElement findBy(String idNameClassNameXpath, String data) {
		WebElement findElement = null;
		try {
			if (idNameClassNameXpath.equalsIgnoreCase("id")) {
				 findElement= driver.findElement(By.id(data));	
			}else if (idNameClassNameXpath.equalsIgnoreCase("name")) {
				 findElement= driver.findElement(By.name(data));	
			}else if (idNameClassNameXpath.equalsIgnoreCase("classname")){
				 findElement= driver.findElement(By.name(data));	
			}else if (idNameClassNameXpath.equalsIgnoreCase("xpath")) {
				findElement=driver.findElement(By.xpath(data));
				
			} 
			
		} catch (Exception e) {
			System.out.println(e);		}
		
		return findElement;
	}
	
	//sendKeys method	
//	public LibGlobal sendKeys(WebElement element ,String data ) {
//		try {
//			element.sendKeys(data);
//			
//		} catch (Exception e) {
//			System.out.println(e);	
//			}
//		return null;
//	}
	
	//only click method
	public void click() {
		WebElement element=null;
		try {
			 element.click();
			
		} catch (Exception e) {
			System.out.println(e);		
			}
	}
	
	//click with webelement
	public void clickWithElement(WebElement element) {
		try {
			element.click();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	
	
	}
		


