package com.bens.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	@Test
	public void f() {
		System.out.println(" At testtestng");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}

	@Test(priority = 5)
	void test2() {
		System.out.println(" New test test2");
	}

	@Test(priority = 10,groups = { "smoke", "functional","Dep" })
	public void login() {
		System.out.println("check where group and functional include");
	}

	@Test(groups = { "functional" })
	public void login1() {
		System.out.println("new test login1");
	}

	@Test(priority = 0)
	public void withoutPriority() {
		System.out.println("new test without priority");
	}
}
