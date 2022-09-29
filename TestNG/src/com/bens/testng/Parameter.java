package com.bens.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({ "name", "age", "url", "testname", "carname" })
	@Test
	public void para1(String myname, int myage, String searchUrl, String testname, String mycare) {
		System.out.println("para1");
		System.out.println(myname);
		System.out.println(myage);
		System.out.println(searchUrl);
		System.out.println(testname);
		System.out.println(mycare);
	}

	@Test
	public void para2() {
		System.out.println("para2");
	}
}
