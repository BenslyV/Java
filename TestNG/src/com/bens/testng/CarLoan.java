package com.bens.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarLoan {
	@Test(enabled=false)
	public void carloan1() {
		System.out.println("Carloan 1");
	}

	@Test(groups = { "Dep" }/*,dependsOnGroups= {"smoke"}*/)
	public void carloan5() {
		System.out.println("Carloan 5");
	}

	@Test(dependsOnMethods = { "carloan5" }, groups = { "Dep" })
	public void carloan2() {
		System.out.println("Carloan 2");
	}

	@Test(groups = "Reg")
	public void logincar() {
		System.out.println("Login carloan");
	}

	@Test(enabled=false)
	public void carloan3() {
		System.out.println("Carloan 2");
	}

	@Test(timeOut=5000)
	public void login() {
		System.out.println("Login carloan");
	}

	@BeforeMethod()
	public void beforeCarloanMethod() {
		System.out.println("Before carloan method");
	}
@Test()
	@AfterMethod()
	public void afterCarloanMethod() {
		System.out.println("After carloan method");
	}
}
