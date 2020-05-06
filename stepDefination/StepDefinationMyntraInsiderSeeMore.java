package com.capgemini.stepDefination;

import static org.testng.Assert.assertEquals;

import com.capgemini.base.Base;
import com.capgemini.pom.MyntraInsiderPom;

import cucumber.api.java.en.Then;

public class StepDefinationMyntraInsiderSeeMore extends Base{
	
	
	MyntraInsiderPom insider;
	@Then("^Click on see more button$")
	public void click_on_see_more_button() throws Throwable {
		insider=new MyntraInsiderPom(driver);
		
		insider.seeMore();
		String title = driver.getTitle();
		

		assertEquals(title, "Myntra Insider - Myntra Loyalty Program|Fashion Advice,VIP Access,Extra Savings");
		System.out.println(title);
		
		
	 
	}

}
