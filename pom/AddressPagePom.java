package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPagePom {
	public AddressPagePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id=\"placeOrderButton\"]")
	WebElement address;
	public void selectAddress() {
		address.click();
	}
	

}
