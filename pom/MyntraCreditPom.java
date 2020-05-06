package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraCreditPom {
	
	
	public MyntraCreditPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Top Up']")
	WebElement topup;
	public void myntraTopUP() {
		topup.click();
	}
	
//	@FindBy(xpath="//span[text()='TOP UP']")
//	WebElement topup2;
//	public void topUpAfterEnteringAmount() {
//		topup2.click();
//	}
	
	

}
