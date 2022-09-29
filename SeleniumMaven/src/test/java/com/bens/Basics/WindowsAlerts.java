package com.bens.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAlerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/upload/";

		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("D:\\WorkSpace\\Files\\test.txt");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();
		driver.close();

	}

}
