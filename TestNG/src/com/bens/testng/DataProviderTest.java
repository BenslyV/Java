package com.bens.testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners(com.bens.testng.TestNGListeners.class)
public class DataProviderTest {
	@Test(dataProvider = "data1")
	public void datalogin(String username, String Password) {
		System.out.println("username" + username);
		System.out.println("password" + Password);
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

	@Test(dataProvider = "SearchProvider", dataProviderClass = com.bens.testng.DataproviderClass.class)
	public void testClassLevelDataProvider(String name, String Cty) {
		System.out.println("name" + name);
		System.out.println("Country" + Cty);
	}

	@Test
	public void onFailCheck() {
		System.out.println("Failcheck");
		boolean bool = false;
		// Assert.assertEquals(bool, true);
	}
}

class DataproviderClass {
	@DataProvider(name = "SearchProvider")
	public static Object[][] getDataFromDataprovider() {
		return new Object[][] { { "Guru99", "India" }, { "Krishna", "UK" }, { "Bhupesh", "USA" } };
	}
}
