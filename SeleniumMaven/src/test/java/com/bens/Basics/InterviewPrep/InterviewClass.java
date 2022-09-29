package com.bens.Basics.InterviewPrep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterviewClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//input[@name='q1']")).sendKeys("You are Awesome");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		Thread.sleep(5000);
		Select s = new Select(ele);
		s.selectByIndex(5);
		if (ele.isDisplayed()) {
			System.out.println("Element enabled");
		}
		else {
			System.out.println("Element not enabled");
		}
		ele.clear();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	}

}
