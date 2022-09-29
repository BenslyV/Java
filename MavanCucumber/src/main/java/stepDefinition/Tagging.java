package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class Tagging {
	
	@Given("^login check$")
	public void login_check() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login check");
	}

	@Given("^Create new deal test$")
	public void create_new_deal_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Create new deal");
	}

	@Given("^Create new contact test$")
	public void create_new_contact_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actionsC
		System.out.println("Create new contact");
	}

	@Given("^Search task$")
	public void search_task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Search Tasks");
	}

	@Given("^Create new deal test(\\d+) -repeated$")
	public void create_new_deal_test_repeated(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Create new deal repeated");
	}

	@Given("^Create new contact(\\d+)$")
	public void create_new_contact(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("crate new contact ");
	}

	@Given("^Left pannel link check$")
	public void left_pannel_link_check() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("left panel link check");
	}

	@Given("^Search a call test$")
	public void search_a_call_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Search a call");
	}

	@Given("^logout check$")
	public void logout_check() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("logout check");
	}

}
