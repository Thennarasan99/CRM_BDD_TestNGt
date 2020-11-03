package com.crmautomation.TestRunner;







import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = "D:\\CRM_BDD_TestNG\\src\\test\\resources\\feature", glue = {"com.crmautomation.stepDef"},
monochrome = true, 
tags={"@check_saved_contacts,@Addcontacts,@negative_testing,@postive_testing"},
plugin = { "pretty",  "html:Reports/cucumber-pretty" ,
"html:target/cucumber-reports/cucumber-html-report",
"json:target/cucumber-reports/CucumberTestReport.json"})
//All tags=@check_saved_contacts,@Addcontacts,@negative_testing,@postive_testing
public class runnerclass extends AbstractTestNGCucumberTests {   
	
	
	
	
}
