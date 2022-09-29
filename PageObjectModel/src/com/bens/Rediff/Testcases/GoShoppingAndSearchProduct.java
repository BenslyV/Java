package com.bens.Rediff.Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bens.Rediff.Pages.HomePage;
import com.bens.Rediff.Pages.ShoppingPage;

public class GoShoppingAndSearchProduct {
	ChromeDriver driver;
	HomePage hp;
	ShoppingPage sp;

	@BeforeTest
	void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome80\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");

	}

	@Test(priority = 3)
	void productSearch() {
		hp = new HomePage(driver);
		sp = new ShoppingPage(driver);
		
		hp.shoppingIcon().click();
		sp.searchBox().sendKeys("Shoes");
		sp.searchbutton().click();
	}

	@Test(enabled = true, priority = 1)
	void gotoMoneyPage() {
		hp = new HomePage(driver);
		hp.moneyIcon().click();
		driver.navigate().back();

	}

	@Test(priority = 2)
	void videoPage() {
		hp = new HomePage(driver);
		hp.videoPage().click();
		driver.navigate().back();
	}

	@Test(priority = 0)
	void newstab() {
		hp = new HomePage(driver);
		hp.newsPage().click();

	}

	@AfterTest
	void teardown() {
		driver.close();

	}
}
