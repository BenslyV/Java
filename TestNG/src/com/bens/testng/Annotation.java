package com.bens.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@Test(groups = { "smoke", "functional" })
	public void test1() {
		System.out.println("test1");
	}
	@BeforeTest
	public void test2() {
		System.out.println("@BeforeTest");

	}
	@AfterTest
	public void test3() {
		System.out.println("@AfterTest");

	}
	@BeforeClass
	public void test4() {
		System.out.println("@@BeforeClass");

	}
	@AfterClass
	public void test5() {
		System.out.println("@@AfterClass");

	}
	@BeforeGroups
	public void test6() {
		System.out.println("@@BeforeGroups");

	}
	@AfterGroups
	public void test7() {
		System.out.println("@@@AfterGroups");

	}
	@BeforeSuite
	public void test8() {
		System.out.println("@@@BeforeSuite");

	}
	@AfterSuite
	public void test9() {
		System.out.println("@@@@AfterSuite");

	}
}
