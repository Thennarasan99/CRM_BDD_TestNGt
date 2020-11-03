package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crmautomation.Utility.Testbase;

public class Crm_contacts_page extends Testbase {

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	public WebElement mainmenu_contact;

	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div[2]/div/a/button")
	public WebElement addnewcontact;

	@FindBy(xpath = "//input[@name='first_name']")
	public WebElement frstname;

	@FindBy(xpath = "//input[@name='last_name']")
	public WebElement lastname;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	public WebElement cmpnyname;

	@FindBy(how = How.NAME, using = "category")
	public WebElement category;

	@FindBy(xpath = "//*[contains(text(),'Customer')]")
	public WebElement categorycustomer;

	@FindBy(name = "status")
	public WebElement status;

	@FindBy(xpath = "//*[contains(text(),'Active')]")
	public WebElement status_active;

	@FindBy(xpath = "//*[@name='description']")
	public WebElement description;

	@FindBy(xpath = "//input[@name='address']")
	public WebElement address;

	@FindBy(xpath = "//input[@name='zip']")
	public WebElement zipcode;

	@FindBy(xpath = "//input[@name='state']")
	public WebElement state;

	@FindBy(name = "country")
	public WebElement country;
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div/div/div/div[5]/div/div[2]/div[100]/span")
	public WebElement countryindia;

	@FindBy(xpath = "//div[@name='source']")
	public WebElement source;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[8]/a[1]/button")
	public WebElement view;

	@FindBy(xpath = "//button[@class='ui linkedin button']")
	public WebElement savebutton;

	@FindBy(xpath = "//table[@class='ui celled sortable striped table custom-grid table-scroll']")
	public WebElement contacts_table;

	public Crm_contacts_page() {
		PageFactory.initElements(driver, this);

	}

	public void click_addcontact_button() throws Exception {
		Thread.sleep(4000);
		mainmenu_contact.click();
		Thread.sleep(4000);

	}

	public void fillup_contacs_details() throws Exception {

		addnewcontact.click();
		frstname.sendKeys(prop.getProperty("contacts.firstname"));
		lastname.sendKeys(prop.getProperty("contacts.lastname"));
		cmpnyname.click();
		cmpnyname.sendKeys(prop.getProperty("contacts.companyname"));
		category.click();
		categorycustomer.click();
//		status.click();
//		status_active.click();
		description.sendKeys(prop.getProperty("contacts.description"));
		address.sendKeys(prop.getProperty("contacts.address"));
		zipcode.sendKeys(prop.getProperty("contacts.zipcode"));
		country.click();
		countryindia.click();
		state.sendKeys(prop.getProperty("contacts.state"));

		
		

	}
public void verifycontacts() throws Exception {
	Thread.sleep(3000);
	mainmenu_contact.click();
	Thread.sleep(3000);
	Testbase.get_table_value(prop.getProperty("contacts.contactsname"));
	driver.quit();
	

	
	
}
public void click_save_button() {
	savebutton.click();
	driver.quit();
}
}
