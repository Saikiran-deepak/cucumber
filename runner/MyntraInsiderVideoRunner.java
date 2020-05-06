package com.capgemini.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="C:\\Users\\Admin 1\\eclipse-workspace\\com.capg.cucumber\\features\\MyntraInsiderVideo.feature",
				glue="com.capgemini.stepDefination",
				dryRun=false,
				plugin= {"pretty", "html:target/Destination)","json:target/Destination/cucumber.json"})

public class MyntraInsiderVideoRunner extends AbstractTestNGCucumberTests{
	

}
