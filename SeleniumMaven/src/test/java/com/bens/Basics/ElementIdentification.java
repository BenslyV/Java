package com.bens.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIdentification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println("Execution done");
		driver.close();
		
	}
	

}
