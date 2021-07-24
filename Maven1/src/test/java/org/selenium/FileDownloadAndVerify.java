package org.selenium;

import java.io.File;

import org.base.LibGlobal;

public class FileDownloadAndVerify {

	public static void main(String[] args) throws InterruptedException {

		LibGlobal global= new LibGlobal();
		
		global.getDriver("chrome");
		global.launchUrl("http://www.leafground.com/pages/upload.html");
		
		global.findBy("xpath", "//*[text()='DownLoad Files']").click();
		
		global.findBy("xpath", "//a[text()='Download Excel']").click();
		
		
		File fileLocation = new File("C:\\Users\\admin\\Downloads");
		
		File[] allFiles = fileLocation.listFiles();
		
		Thread.sleep(3000);
		
		for (File file : allFiles) {
			
			if (file.getName().equals("testleaf.xlsx")) {
				
				System.out.println("file is downloaded"+ file.getName());
				break;
			}
			
		}
		
		
		
	}

}
