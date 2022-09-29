package com.bens.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

	

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("test before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("test after test");
	}

}
