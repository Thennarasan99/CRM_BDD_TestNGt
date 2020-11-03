package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crmautomation.Utility.Testbase;

public class Crm_home_page extends Testbase {

	 @FindBy(xpath="//span[text()='thennarasan selvam']")
	    public WebElement userid; 

	 public Crm_home_page() {
			PageFactory.initElements(driver, this);

		}
	
        
       public void verify_userid() {
    	   
    	   Assert.assertEquals(userid.getText(),  prop.getProperty("homepageusername"));
    	   driver.quit();
    	 
       }
       
}
