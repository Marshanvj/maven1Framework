package org.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("before class");

	}
	@AfterClass
	private void afterClass() {
       System.out.println("after class");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("before method");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("after method");
	}
	
	@Test
	public void test01() {
		System.out.println("done test!!");
	}

}
