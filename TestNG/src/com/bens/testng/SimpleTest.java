package com.bens.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest 
{
	private String param = "";

	public SimpleTest(String param) {
		this.param = param;
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before SimpleTest class executed.");
	}

	@Test(enabled=true)
	public void testMethod() {
		System.out.println("testMethod parameter value is: " + param);
	}
}

