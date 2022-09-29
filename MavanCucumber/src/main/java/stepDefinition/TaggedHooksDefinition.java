package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksDefinition {
	@Before(order = 0)
	public void before_order_0() {
		// TODO Auto-generated method stub
		System.out.println("Before order zero executed");
	}

	@Before
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Global hooks for login");
	}

	@After
	public void close_browser() {
		// TODO Auto-generated method stub
		System.out.println("Global hooks for close browser");
	}

	@After(order = 0)
	public void after_order_0() {
		// TODO Auto-generated method stub
		System.out.println("after order zero executed");
	}

	@Before("@Second")
	public void precondition_only_for_second() {
		// TODO Auto-generated method stub
		System.out.println("Precondtion has been executed only for Second");
	}

	@After("@First")
	public void post_condtion_for_first() {
		// TODO Auto-generated method stub
		System.out.println("Post condition only for first");
	}

	@Given("^given for first scenerio$")
	public void given_for_first_scenerio() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given for first Scenerio");
	}

	@When("^when for for first scenerio$")
	public void when_for_for_first_scenerio() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When for first Scenerio");
	}

	@Then("^then for first scenrio$")
	public void then_for_first_scenrio() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then for first Scenerio");
	}

	@Given("^given for second scenerio$")
	public void given_for_second_scenerio() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given for second scenerio");
	}

	@Given("^given for third scenerio$")
	public void given_for_third_scenerio() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given for third Scenerio");
	}

}
