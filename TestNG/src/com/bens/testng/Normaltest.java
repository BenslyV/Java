package com.bens.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Normaltest {
	@BeforeTest
	public void beforeNormal() {
		System.out.println("Before nomal test");
	}

	@AfterTest
	public void afterNormal() {
		System.out.println("After nomal test");
	}

	@Test(groups="Reg")
	public void normalTest() {
		System.out.println("nomal test execution");
	}

	@Test(groups="Reg")
	public void login() {
		System.out.println("Login normal test");
	}

	@Test
	public void bikeLoan() {
		System.out.println("nomal test execution");
	}

	@Test(groups = { "functional" })
	public void bikeloan2() {
		System.out.println("nomal test execution");
	}

	@Test
	public void bikelogin() {
		System.out.println("nomal test execution");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before nomal class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After nomal class");
	}
}
