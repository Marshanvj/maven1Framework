package org.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.base.LibGlobal;

public class UploadFileExample extends LibGlobal{

	public static void main(String[] args) throws AWTException  {
		
		LibGlobal global= new LibGlobal();
		
		global.getDriver("chrome");
		global.launchUrl("http://www.leafground.com/pages/upload.html");
		global.findBy("xpath", "//*[@id=\"mydiv\"]/input").click();
		
		
		
		String file="C:\\Users\\admin\\Downloads\\testleaf.xlsx";
		
		StringSelection selection= new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}

}
