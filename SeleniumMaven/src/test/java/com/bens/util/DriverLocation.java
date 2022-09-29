package com.bens.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLocation {
	public void Chrome() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
