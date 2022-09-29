package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsCreation {

	WebDriver driver;

	@Given("^Login to create new deal$")
	public void login_to_create_new_deal(DataTable credentials) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");

		List<List<String>> creden = credentials.raw();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(creden.get(0).get(0));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(creden.get(0).get(1));
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^Navigate to deal and create new deal$")
	public void navigate_to_deal_and_create_new_deal(DataTable data) {
		driver.findElement(By.xpath("//div[@id='main-nav']//a[5]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();

		List<List<String>> data_val = data.raw();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data_val.get(0).get(0));
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(data_val.get(0).get(1));
		driver.findElement(By.xpath("//textarea[@name='next_step']")).sendKeys(data_val.get(0).get(2));
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	}

	@Then("^Close browser once deals created$")
	public void close_browser_once_deals_created() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("test execution Done");
		driver.close();
	}

}
