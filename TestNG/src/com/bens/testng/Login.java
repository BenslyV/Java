package com.bens.testng;

import org.testng.annotations.Test;

public class Login {
	@Test(dataProvider="cred",dataProviderClass = com.bens.testng.DataproviderClassCommon.class)
	void logintest(String user, String pass){
		System.out.println("username"+user);
		System.out.println("password"+pass);
	}

}
