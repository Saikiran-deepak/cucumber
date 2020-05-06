package com.capgemini.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class CreditEndToEndRunner {
	
	
	
	@CucumberOptions(features="C:\\Users\\\\Admin 1\\eclipse-workspace\\com.capg.cucumber\\features\\CreditEndToEnd.feature",
			glue= {"com.capgemini.stepDefination"},
			dryRun=false,
			plugin= {"pretty", "html:target/Destination)","json:target/Destination/cucumber.json"})
public class LoginRunner extends  AbstractTestNGCucumberTests{

}
}
