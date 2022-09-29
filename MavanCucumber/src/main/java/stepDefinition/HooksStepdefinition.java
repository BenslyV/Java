package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepdefinition {

	@Before
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("usr login done");
	}

	@After
	public void close_browser() {
		System.out.println("please close the browser"); // TODO Auto-generated method stub

	}

	@Given("^user already on deals page$")
	public void user_already_on_deals_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User already on deals page");
	}

	@When("^enter the deatils$")
	public void enter_the_deatils() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("enter the details");
	}

	@Then("^deal created successfully$")
	public void deal_created_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("deal ceated successfully");
	}

}
