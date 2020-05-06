package com.capgemini.stepDefination;

import com.capgemini.base.Base;
import com.capgemini.pom.LoginPom;
import com.capgemini.pom.MyntraCreditPom;
import com.capgemini.pom.MyntraCreditTopUpPom;
import com.capgemini.pom.PaymentPagePom;
import com.capgemini.pom.ProfilePom;

import cucumber.api.java.en.Then;

public class StepDefinationCreditEndToEnd extends Base {

	Base b;
	LoginPom login;
	ProfilePom p1;
	MyntraCreditPom credit;
	MyntraCreditTopUpPom topup;

	@Then("^Click on myntra credit under profile$")
	public void Click_on_myntra_credit_under_profile() throws Throwable {

		Thread.sleep(5000);
		p1 = new ProfilePom(driver);
		p1.profile();
		p1.myntraCredit();

	}

	@Then("^Click on toptp button$")
	public void click_on_toptp_button() throws Throwable {
		credit = new MyntraCreditPom(driver);
		credit.myntraTopUP();
	}

	@Then("^Select or enter amount valid amount$")
	public void Select_or_enter_amount_valid_amount() throws Throwable {

		topup = new MyntraCreditTopUpPom(driver);
		topup.enterAmount();
	}

	@Then("^Click on login button$")
	public void Click_on_login_button() throws Throwable {

		topup = new MyntraCreditTopUpPom(driver);
		topup.topUpAfterEnteringAmount();
	}

	@Then("^Enter card detail$")
	public void enter_card_detail() throws Throwable {
		login = new LoginPom(driver);
		PaymentPagePom payment = new PaymentPagePom(driver);
		
		payment.selectUPI();
		payment.selectPhonePe();
	}

	@Then("^Click on Pay Now$")
	public void click_on_Pay_Now() throws Throwable {

		PaymentPagePom payment = new PaymentPagePom(driver);
		payment.payNowUsingGooglePe();
	}

}













