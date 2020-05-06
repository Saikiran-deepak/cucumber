package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.Base;

public class LoginPom extends Base {

	public LoginPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "mobileNumberPass")
	WebElement num;

	public void enterNumber(String email) {
		num.sendKeys(email);
	}
	
	public void clearEnterNumer() {
		num.clear();
	}

	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement pass;
	
	public void password(String passw) {
		pass.sendKeys(passw);
	}	
	
	@FindBy(xpath="//button[text()='LOGIN']")
	WebElement log;
	public void loginToMyntra() {
		log.click();
	}


}
