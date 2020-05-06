package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPagePom {
	
	public PaymentPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="cardNumber")
	WebElement number;
	public void enterCardNumber() {
		number.click();
	}
	@FindBy(id="cardName")
	WebElement name;
	public void enterNameOnCard() {
		name.click();
	}
	
	@FindBy(id="expiryMonth")
	WebElement expmonth;
	public void expiryMonth() {
		expmonth.click();
	}
	@FindBy(xpath="//option[text()='FEB']")
	WebElement month;
	public void selectExpiryMonth() {
		month.click();
	}
	
	@FindBy(id="expiryYear")
	WebElement expyear;
	public void expiryYear()
	{
		expyear.click();
	}
	@FindBy(xpath="//option[text()='2023']")
	WebElement year;
	public void selectExpiryYear()
	{
		year.click();
	}
	@FindBy(id="cvv")
	WebElement cv;
	public void enterCVV()
	{
		cv.click();
	}
	@FindBy(id="action-card")
	WebElement pay;
	public void paynow()
	{
		pay.click();
	}
	@FindBy(id="upi")
	WebElement upi;
	public void selectUPI()
	{
		upi.click();
	}
	@FindBy(xpath="//span[text()='PhonePe']")
	WebElement phonepe;
	public void selectPhonePe() {
		phonepe.click();
	}
	@FindBy(id="action-upi")
	WebElement googlepe;
	public void payNowUsingGooglePe() {
		googlepe.click();
	}

	
	@FindBy(xpath="//span[text()='PHONEPE/GOOGLE PAY/BHIM UPI']")
	WebElement paytype;
	public void selectPaymentOrder() {
		paytype.click();
	}
}
