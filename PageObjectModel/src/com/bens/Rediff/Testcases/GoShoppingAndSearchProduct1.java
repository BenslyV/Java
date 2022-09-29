package com.bens.Rediff.Testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import com.bens.Rediff.Pages.HomePage;
import com.bens.Rediff.Pages.ShoppingPage;

public class GoShoppingAndSearchProduct1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome80\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		HomePage hp = new HomePage(driver);
		ShoppingPage sp = new ShoppingPage(driver);
		hp.shoppingIcon().click();
		sp.searchBox().sendKeys("Shoes");
		sp.searchbutton().click();
		driver.close();

	}

}
