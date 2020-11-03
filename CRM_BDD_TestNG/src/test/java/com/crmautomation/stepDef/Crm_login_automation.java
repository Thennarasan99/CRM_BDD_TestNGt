package com.crmautomation.stepDef;

import com.crm.pages.Crm_home_page;
import com.crm.pages.Crm_login_page;
import com.crmautomation.Utility.Testbase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Crm_login_automation extends Testbase {
	Crm_login_page loginpage;
	Crm_home_page homepage;

	public Crm_login_automation() {
		super();
	}

	@Given("User is in login page")
	public void user_is_in_login_page() throws Exception {
		Testbase.Initianlizaion();

	}

	@When("user enters invalid_username and invalid_password")
	public void user_enters_invalid_username_and_invalid_password() {
		loginpage = new Crm_login_page();
		loginpage.in_valid_login();

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		loginpage = new Crm_login_page();
		loginpage.valid_login();
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

		loginpage = new Crm_login_page();
		loginpage.click_sumbmit();
	}

	@Then("user is navigate to the home page and verify the userid")
	public void user_is_navigate_to_the_home_page() {
		homepage = new Crm_home_page();
		homepage.verify_userid();

	}

	// user enters invalid_username and invalid_password
	@Then("user should get error message")
	public void user_should_get_error_message() {
		loginpage = new Crm_login_page();
		loginpage.validate_errormsg();
	}

}
