package com.bens.Rediff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingPage {

	WebDriver driver;

	public ShoppingPage(ChromeDriver driver) {
		this.driver = driver;
	}

	By searchbox = By.xpath("//input[@id='srchword']");
	By searchButton = By.xpath("//input[@class='newsrchbtn']");

	public WebElement searchBox() {
		return driver.findElement(searchbox);
	}

	public WebElement searchbutton() {
		return driver.findElement(searchButton);
	}

}
