package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		String title1 = driver.getTitle();
		System.out.println("title" + title1);

		System.out.println("user is already on Login Page");
		// driver.close();

	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		System.out.println("title of login page is Cogmento CRM");
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	/*
	 * public void user_enters_and() { // Write code here that turns the phrase
	 * above into concrete actions
	 * driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).
	 * sendKeys("bensly.v@gmail.com");
	 * driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
	 * "Rohit12#"); System.out.println("User name and password entered");
	 */
	

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		System.out.println("user clicks login button");
		String homepageTitle = driver.getTitle();
		System.out.println("homepageTitle" + homepageTitle);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is on home page");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		System.out.println("title of login page is Cogmento CRM");
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("browser section closed");
		driver.close();
	}

	/*
	 * WebDriver driver;
	 * 
	 * @Given("^user is already on Login Page$") public void
	 * user_already_on_login_page() { System.setProperty("webdriver.chrome.driver",
	 * "/Users/naveenkhunteta/Downloads/chromedriver"); driver = new ChromeDriver();
	 * driver.get("https://www.freecrm.com/index.html"); }
	 * 
	 * @When("^title of login page is Free CRM$") public void
	 * title_of_login_page_is_free_CRM() { String title = driver.getTitle();
	 * System.out.println(title); Assert.
	 * assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software"
	 * , title); }
	 * 
	 * // Reg Exp: // 1. \"([^\"]*)\" // 2. \"(.*)\"
	 * 
	 * @Then("^user enters \"(.*)\" and \"(.*)\"$") public void
	 * user_enters_username_and_password(String username, String password) {
	 * driver.findElement(By.name("username")).sendKeys(username);
	 * driver.findElement(By.name("password")).sendKeys(password); }
	 * 
	 * @Then("^user clicks on login button$") public void
	 * user_clicks_on_login_button() { WebElement loginBtn =
	 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
	 * js = (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
	 * loginBtn); }
	 * 
	 * @Then("^user is on home page$") public void user_is_on_hopme_page() { String
	 * title = driver.getTitle(); System.out.println("Home Page title ::" + title);
	 * Assert.assertEquals("CRMPRO", title); }
	 * 
	 * @Then("^user moves to new contact page$") public void
	 * user_moves_to_new_contact_page() { driver.switchTo().frame("mainpanel");
	 * Actions action = new Actions(driver);
	 * action.moveToElement(driver.findElement(By.xpath(
	 * "//a[contains(text(),'Contacts')]"))).build().perform();
	 * driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	 * 
	 * }
	 * 
	 * @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 * public void user_enters_contacts_details(String firstname, String lastname,
	 * String position) {
	 * driver.findElement(By.id("first_name")).sendKeys(firstname);
	 * driver.findElement(By.id("surname")).sendKeys(lastname);
	 * driver.findElement(By.id("company_position")).sendKeys(position);
	 * driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).
	 * click(); }
	 * 
	 * @Then("^Close the browser$") public void close_the_browser() { driver.quit();
	 * }
	 */
}
