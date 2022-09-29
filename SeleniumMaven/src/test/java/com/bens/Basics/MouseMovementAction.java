package com.bens.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class MouseMovementAction {

	public static void main(String[] args) throws Exception {
		
		//Mouse Action
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement addone = driver.findElement(By.xpath("//a[@id='highlight-addons']"));
		Actions a = new Actions(driver);
		a.moveToElement(addone).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'You 1st')]")).click();
		String text = driver.findElement(By.xpath(
				"//div[@class='pageloader-btn']//input[@id='ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ButtonRetrieve']"))
				.getText();
		String expected = "Retrieve Booking";
		// Assert.assertEquals(expected, text);
		System.out.println("Execution Done");
		
		//Drag and drop

		System.out.println("Execution for the second Site - Drag and Drop");
		driver.manage().deleteAllCookies();

		driver.get("http://jqueryui.com/droppable/");

		driver.switchTo().frame(0);// switch to frame if its present

		Actions action = new Actions(driver);

		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		System.out.println("draga nd drop execution done");
		driver.close();
	}

}
