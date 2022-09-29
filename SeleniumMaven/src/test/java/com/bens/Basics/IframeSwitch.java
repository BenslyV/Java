package com.bens.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSwitch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		String baseUrl = "http://demo.guru99.com/test/guru99home/";
//
//		driver.get(baseUrl);
//		// System.out.println(driver.getPageSource());
//		driver.switchTo().frame("a077aa5e"); // switching the frame by ID
//
//		System.out.println("********We are switch to the iframe*******");
//		driver.findElement(By.xpath("html/body/a/img")).click();
//
//		// Clicks the iframe
//		System.out.println("Element identification done");
//		System.out.println("*********We are done***************");
//		driver.close();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("bensly.v@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rohit12#");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		System.out.println(driver.getPageSource());
	
		
	}

}
