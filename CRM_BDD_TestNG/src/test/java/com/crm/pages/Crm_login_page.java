package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crmautomation.Utility.Testbase;

public class Crm_login_page extends Testbase {

	@FindBy(xpath = "//a/span[text()='Log In']")
	WebElement search;

	@FindBy(xpath = "//input[@name='email']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;

	@FindBy(xpath = "//div[@class=\"ui negative message\"]")
	WebElement errormsg;

	public Crm_login_page() {
		PageFactory.initElements(driver, this);

	}

	public void valid_login() {

		search.click();
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));

	}

	public void click_sumbmit() {
		loginbtn.click();

	}

	public void in_valid_login() {

		search.click();
		username.sendKeys(prop.getProperty("invalid_username"));
		password.sendKeys(prop.getProperty("invalid_password"));

	}

	public void validate_errormsg() {

		Assert.assertTrue(errormsg.getText().contains("Invalid login"));
		driver.quit();
	}
}
