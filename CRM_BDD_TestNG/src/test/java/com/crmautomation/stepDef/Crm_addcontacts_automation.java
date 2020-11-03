package com.crmautomation.stepDef;

import com.crm.pages.Crm_contacts_page;
import com.crm.pages.Crm_home_page;
import com.crm.pages.Crm_login_page;
import com.crmautomation.Utility.Testbase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Crm_addcontacts_automation extends Testbase {
	Crm_login_page loginpage;
	Crm_home_page homepage;
	Crm_contacts_page contactpage;
	

	public Crm_addcontacts_automation() {
		super();
	}
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		Testbase.Initianlizaion();
		loginpage = new Crm_login_page();
		loginpage.valid_login();
		loginpage.click_sumbmit();
	}

	@When("user clicks on add contact button")
	public void user_clicks_on_add_contact_button() throws Exception {
		contactpage=new Crm_contacts_page();
		
		contactpage.click_addcontact_button();
		
	}

	@And("user fill-up the page with valid deatils")
	public void user_fill_up_with_valid_deatils_and_click_save_button() throws Exception {
		
		contactpage.fillup_contacs_details();
	}

	@Then("click save button")
	public void click_save_button() throws Exception {
		contactpage=new Crm_contacts_page();
		contactpage.click_save_button();
		

}
	@Then("user should verify saved contact details in my contacs page")
	public void user_should_see_saved_contact_details_in_my_contacs_page() throws Exception {
		
		contactpage=new Crm_contacts_page();
		contactpage.verifycontacts();

}
}