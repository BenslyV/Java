package MavanCucumber.MavanCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		String title1 = driver.getTitle();
		System.out.println("title" + title1);

		System.out.println("user is already on Login Page");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		System.out.println("title of login page is Cogmento CRM");

		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("bensly.v@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rohit12#");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		System.out.println("user clicks login button");
		String homepageTitle = driver.getTitle();
		System.out.println("homepageTitle" + homepageTitle);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("no of frames" + size);

		System.out.println(driver.getPageSource());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	//	driver.switchTo().frame(driver.findElement(By.xpath("\"//div[@id='main-nav']//a[3]\"")));

		driver.findElement(By.xpath("//div[@id='main-nav']//a[3]")).click();
		System.out.println("Contact page opened successfully");

		
		 driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ram");
		 driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Selvan");
		 driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		 System.out.println("contact saved successfully");
		 
	}

}
