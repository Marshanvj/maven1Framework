package org.testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	
	
	@Test(groups= {"School"})
	public void school() {
		System.out.println("midlevel school");

	}
	
	@Test(groups={"School"})
	public void school1() {
		System.out.println("higher school");
	}
	
	@Test(groups={"College"})
	public void college() {
		System.out.println("cse");

	}
	
	@Test(groups={"College"})
	public void college1() {
		System.out.println("IT");

	}
	
	@Test(groups= {"School"})
	public void college2() {
		System.out.println("mech");

	}
	

}
