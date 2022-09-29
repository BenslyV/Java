package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;
import junit.framework.Assert;

public class ContactCreation {
	WebDriver driver;

	@Given("^user is already on Login Page to cretae new contact$")
	public void user_is_already_on_Login_Page_to_cretae_new_contact() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Drivers\\Chrome\\Chrome79\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		String title1 = driver.getTitle();
		System.out.println("title" + title1);

		System.out.println("user is already on Login Page");
	}

	@When("^title of login page is Free contact creation$")
	public void title_of_login_page_is_Free_contact_creation() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		System.out.println("title of login page is Cogmento CRM");
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" for contact$")
	public void user_enters_and_for_contact(String username, String password) {
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@Then("^user clicks on login button to enter homepage for contact$")
	public void user_clicks_on_login_button_to_enter_homepage_for_contact() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		System.out.println("user clicks login button");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement contacts;
		contacts = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		// contacts.click();
		String homepageTitle = driver.getTitle();
		System.out.println("homepageTitle" + homepageTitle);
	}

	@Then("^user is on home page to create contact$")
	public void user_is_on_home_page_to_create_contact() {
		System.out.println("user is on home page");
	}

	@Then("^navigate to contact page and create new contact$")
	public void navigate_to_contact_page_and_create_new_contact() {

		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();

		System.out.println("Contact page opened successfully");
	}

	@Then("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String firstname, String lastname) {
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		driver.manage().timeouts().implicitlyWait(20, java.util.concurrent.TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		System.out.println("contact saved successfully");

	}

	@Then("^onece contact created Close the browser$")
	public void onece_contact_created_Close_the_browser() {
		driver.close();

	}
}
