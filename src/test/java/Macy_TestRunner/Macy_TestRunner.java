package Macy_TestRunner;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Macy_Utility.Macy_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Macy_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Macy_StepDefinition")//tags = {""})



public class Macy_TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void macStartURL() {
	Macy_Base mac = new Macy_Base();	
	mac.MacBrowser();	
		
	}
	
	@AfterTest
	public void macCloseURL() {
	Macy_Base mac = new Macy_Base();
	mac.driver.quit();
	
	}	
	
}
