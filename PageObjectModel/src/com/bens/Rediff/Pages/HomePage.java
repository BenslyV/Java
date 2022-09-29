package com.bens.Rediff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	By mailicon = By.xpath("//a[@class='mailicon']");
	By shoppingicon = By.xpath("//a[@class='shopicon relative']");
	By moneyicon = By.xpath("//a[@class='moneyicon relative']");
	By videosIcon = By.xpath("//a[@class='vdicon']");
	By searchNewsBox = By.xpath("//input[@id='srchquery_tbox']");
	By searchnewsbutton = By.xpath("//form[@name='newsrchform']//input[@class='newsrchbtn']");
		
	
	@FindBy(xpath="//li[contains(text(),'HOME')]")
	WebElement hometab;
	@FindBy(xpath="//div[@class='navbar cor_margin']//li[2]//a[1]")
	WebElement newsTab;
	
	/*By hometab = By.xpath("//li[contains(text(),'HOME')]");
	By newsTab = By.xpath("//div[@class='navbar cor_margin']//li[2]//a[1]");*/

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement shoppingIcon() {
		// TODO Auto-generated method stub
		return driver.findElement(shoppingicon);
		
	}

	public WebElement moneyIcon() {
		// TODO Auto-generated method stub
		return driver.findElement(moneyicon);
	}

	public WebElement videoPage() {
		// TODO Auto-generated method stub
		return driver.findElement(videosIcon);
	}

	public WebElement newsPage() {
		// TODO Auto-generated method stub
		return hometab;
	}

}
