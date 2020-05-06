package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraCreditTopUpPom {
	public MyntraCreditTopUpPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='500']")
	WebElement money;
	public void enterAmount() {
		money.click();
	}
	
	
	@FindBy(className="topupWithoutCoupon-topUpButton")
	WebElement topup2;
	public void topUpAfterEnteringAmount() {
		topup2.click();
	}


}
