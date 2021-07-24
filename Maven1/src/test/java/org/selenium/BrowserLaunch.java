package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		Thread.sleep(2000);
		//driver.findElement(By.name("q")).sendKeys("leaf ground"+ Keys.ENTER)
		WebElement linkText=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		linkText.click();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement enterEmailAddress= driver.findElement(By.id("email"));
		enterEmailAddress.sendKeys("test@gmail.com");
		WebElement append= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		append.sendKeys("AppendedText");
		WebElement findTextInsideTheTextBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String getTextFromTextBox=findTextInsideTheTextBox.getAttribute("value");
		System.out.println(getTextFromTextBox);
		WebElement clearTextFromTextBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearTextFromTextBox.clear();
		WebElement textBoxDisabledOrNot= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enableOrNot= textBoxDisabledOrNot.isEnabled();
		System.out.println(enableOrNot);
		
		if(enableOrNot==true) {
			System.out.println("text box is enabled");
			
		}else {
			System.out.println("text box is disabled");
		}
		System.out.println("done!!");
		
		
	}

}
