package org.selenium;


import org.base.LibGlobal;
import org.openqa.selenium.WebElement;

public class BrowserLaunchWithBase extends LibGlobal {

	public static void main(String[] args) {
		
		LibGlobal global=new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("http://www.leafground.com/pages/Link.html");
		global.findBy("xpath", "//*[@id=\'contentblock\']/section/div[1]/div/div/a");
		
		
	}

}
