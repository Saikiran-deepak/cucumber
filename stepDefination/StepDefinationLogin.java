package com.capgemini.stepDefination;

import com.capgemini.base.Base;
import com.capgemini.pom.LoginPom;
import com.capgemini.pom.MyntraCreditPom;
import com.capgemini.pom.ProfilePom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinationLogin extends Base {

	//Base b;
	LoginPom login;
	ProfilePom p1;
	MyntraCreditPom credit;

	@Given("^Open browser And enter url$")
	public void open_browser_And_enter_url() throws Throwable {
		Base.openBrowser("chrome");
	}
	
	

	@Then("^Enter email and password from path$")
	public void enter_email_and_password_from_path() throws Throwable {
		login = new LoginPom(driver);
		
		String email=getExcelData("E:\\jee-2019-09\\Login.xlsx", "Sheet1", 1, 0);
		
		login.clearEnterNumer();
		login.enterNumber(email);
		
		String passw=getExcelData("E:\\jee-2019-09\\Login.xlsx", "Sheet1", 1, 1);
		login.password(passw);
	}

	@Then("^click on login$")
	public void click_on_login() throws Throwable {
		login = new LoginPom(driver);

		login.loginToMyntra();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   Base.closeBrowser();
	}


	}

