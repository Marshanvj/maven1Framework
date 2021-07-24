package org.automate;

import org.base.LibGlobal;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomateUsingJunit extends LibGlobal{
	LibGlobal global=new LibGlobal();
	
	@BeforeClass
	private void beforeClass() {
		global.getDriver("chrome");
		

	}

	@Test
	private void tc01() {
		
		

	}
}
