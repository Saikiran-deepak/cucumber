package com.capgemini.stepDefination;

import java.util.concurrent.TimeUnit;

import com.capgemini.base.Base;
import com.capgemini.pom.AddressPagePom;
import com.capgemini.pom.EssentialsPom;
import com.capgemini.pom.MyntraBagPom;
import com.capgemini.pom.PaymentPagePom;
import com.capgemini.pom.ProfilePom;

import cucumber.api.java.en.Then;

public class StepDefinationCouponsEndToEnd extends Base {
	EssentialsPom coupons;
	ProfilePom p;
	MyntraBagPom bagp;
	AddressPagePom add;

	@Then("^Select essentials$")
	public void select_essentials() throws Throwable {

		p = new ProfilePom(driver);
		p.SelectEssentials();
	}

	@Then("^Select applians$")
	public void select_applians() throws Throwable {
		p = new ProfilePom(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		p.selectBodycare();
	}

	@Then("^Select a product$")
	public void select_a_product() throws Throwable {
		coupons = new EssentialsPom(driver);
		coupons.selectProduct();
	}

	@Then("^Add to bag$")
	public void add_to_bag() throws Throwable {
		coupons.clickAddToBag();
	}

	@Then("^Select size$")
	public void select_size() throws Throwable {
		coupons.selectProductSize();

	}

	@Then("^Open bag click on apply coupons$")
	public void open_bag_click_on_apply_coupons() throws Throwable {
		Thread.sleep(6000);
		bagp = new MyntraBagPom(driver);
		bagp.clickOnBagIcon();

	}

	@Then("^Enter coupon code And Click on apply$")
	public void enter_coupon_code_And_Click_on_apply() throws Throwable {
		String coupon=getExcelData("E:\\jee-2019-09\\Login.xlsx", "Sheet2", 1, 2);
		bagp = new MyntraBagPom(driver);
		bagp.clickOnAddCoupons();
		Thread.sleep(5000);
		bagp.addCoupons(coupon);
		bagp.applyAfterAddingCoupon();

	}

	@Then("^Click on place order$")
	public void click_on_place_order() throws Throwable {
		bagp = new MyntraBagPom(driver);
		bagp.placeOrder();

	}

	/*
	 * To select shipment address
	 */
	@Then("^User select address$")
	public void user_select_address() throws Throwable {
		add = new AddressPagePom(driver);
		add.selectAddress();
	}

	@Then("^User select payment method$")
	public void user_select_payment_method() throws Throwable {
		PaymentPagePom payment = new PaymentPagePom(driver);
		payment.selectPaymentOrder();
		payment.selectPhonePe();

	}

}
