package com.capgemini.stepDefination;

import static org.testng.Assert.assertEquals;

import com.capgemini.base.Base;
import com.capgemini.pom.MyntraInsiderPom;

import cucumber.api.java.en.Then;

public class StepDefinationMyntraInsiderPointsHistory extends Base{
	Base b=new Base();
	
	MyntraInsiderPom insider;
	@Then("^click on points history$")
	public void click_on_points_history() throws Throwable {
		insider=new MyntraInsiderPom(driver);
		insider.myntraInsiderPointsHistory();
		String title = driver.getTitle();
		

			assertEquals(title, "Myntra Insider - History");
			System.out.println(title);
		
		
	   
	}

}
