package org.automate;

import org.adactinPageObject.AdactinLoginPage;
import org.base.LibGlobal;
import org.openqa.selenium.support.PageFactory;

public class AdactinLaunch extends LibGlobal{

	public static void main(String[] args) {
	LibGlobal global =new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("https://adactinhotelapp.com/index.php");
	
		
		//Dependancy injection---- it is not a best practice to create a another class oject in the usage class
		// to overcome this we use static keyword for the method which we are calling in this class eg. username is the method which we are calling so put static in another calls method
		// public static WebElement userName(){*******}
		// if i change static to that method of another class I simply use that classname to call the method name
		
		
	//AdactinLoginPage loginPage =new AdactinLoginPage();
	
	
	/*
	 * AdactinLoginPage.userName(driver).sendKeys("marshanantony");
	 * AdactinLoginPage.password(driver).sendKeys("1234567890");
	 * AdactinLoginPage.loginButton(driver).click();
	 */
	
		PageFactory.initElements(driver, AdactinLoginPage.class);
		
		AdactinLoginPage.userName.sendKeys("marshanantony");
		AdactinLoginPage.password.sendKeys("1234567890");
		AdactinLoginPage.loginButton.click();
		
		
		
		
	}

}
