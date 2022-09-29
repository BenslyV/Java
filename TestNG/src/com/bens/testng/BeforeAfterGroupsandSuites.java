package com.bens.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class BeforeAfterGroupsandSuites {
	@BeforeGroups(value="smoke")
	public void beforesomke() {
		System.out.println("Before Smoke group");
	}

	@AfterGroups(value="smoke")
	public void aftersomke() {
		System.out.println("After Smoke group");
	}

	@BeforeGroups("functional")
	public void beforefunctional() {
		System.out.println("Before functional group");
	}

	@AfterGroups("functional")
	public void afterfunctional() {
		System.out.println("After functional group");
	}
	
}
