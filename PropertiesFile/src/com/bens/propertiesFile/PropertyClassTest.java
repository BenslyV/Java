package com.bens.propertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyClassTest {
	public String username;

	@Test
	void loginTest() {
		System.out.println("login");
	}

	@Test
	void propMethod() throws Exception {
		File file = new File("D:\\WorkSpace\\Eclipse\\PropertiesFile\\src\\com\\bens\\propertiesFile\\data.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		username = prop.getProperty("username");
		System.out.println("username" + username);

	}

}
