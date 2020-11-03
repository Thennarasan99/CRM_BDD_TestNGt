package com.crmautomation.TestRunner;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;

@CucumberOptions(features = "D:\\CRM_BDD_TestNG\\src\\test\\resources\\feature", glue = {"com.crmautomation.stepDef"},
monochrome = true, 
tags={"@check_saved_contacts,@Addcontacts,@negative_testing,@postive_testing"},
plugin = { "pretty",  "html:Reports/cucumber-pretty" ,
"html:target/cucumber-reports/cucumber-html-report",
"json:target/cucumber-reports/CucumberTestReport.json"})
//All tags=@check_saved_contacts,@Addcontacts,@negative_testing,@postive_testing
public class testrunner_ex extends AbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {    	
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")    
    public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
    	//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
    }
    
    @DataProvider//(parallel=true)
    public Object[][] features() {
       // return testNGCucumberRunner.provideFeatures();    	
    	 return testNGCucumberRunner.provideScenarios();
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {    	
        testNGCucumberRunner.finish();        
    }
}

