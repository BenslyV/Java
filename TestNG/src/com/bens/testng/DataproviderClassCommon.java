package com.bens.testng;

import org.testng.annotations.DataProvider;

public class DataproviderClassCommon {
	@DataProvider(name = "SearchProvider")
	public static Object[][] getDataFromDataprovider() {
		return new Object[][] { { "Guru99", "India" }, { "Krishna", "UK" }, { "Bhupesh", "USA" } };
	}

	@DataProvider(name = "cred")
	public Object[][] data() {
		Object[][] values = new Object[3][2];
		values[0][0] = "firstusrname";
		values[0][1] = "firstpassword";
		values[1][0] = "Second usrname";
		values[1][1] = "Second password";
		values[2][0] = "Third usrname";
		values[2][1] = "Third password";
		return values;
	}

	@DataProvider
	public Object[][] data1() {
		Object[][] values = new Object[3][2];
		values[0][0] = "firstusrname";
		values[0][1] = "firstpassword";
		values[1][0] = "Second usrname";
		values[1][1] = "Second password";
		values[2][0] = "Third usrname";
		values[2][1] = "Third password";
		return values;

	}
}
