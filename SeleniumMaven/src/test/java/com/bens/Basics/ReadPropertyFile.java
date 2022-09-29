package com.bens.Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"D:\\WorkSpace\\Eclipse\\SeleniumMaven\\Properties\\config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");

		System.out.println(url);

		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/internetexplorerdriver");
			driver = new InternetExplorerDriver();
		}

		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("searchbox_xpath"))).sendKeys(prop.getProperty("search"));
		driver.findElement(By.xpath(prop.getProperty("Search_click_xpath"))).click();
		System.out.println("Execution Done");
		driver.close();

	}

}
