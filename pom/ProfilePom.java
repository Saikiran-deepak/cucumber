package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.Base;

public class ProfilePom extends Base{
	
	Actions action;
	
	
	@FindBy(xpath="//span[contains(text(),'Profile')]")
	WebElement profi;
	public void profile() {
		profi.click();
	}
	@FindBy(xpath="//div[contains(text(),'Myntra Credit')]")
	WebElement credit;
	public void myntraCredit() {
		credit.click();
	}
	
	
	
	
	public ProfilePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//To select Essentials on home page
	
	@FindBy(xpath="//a[contains(text(),'Essentials')]")
	WebElement essential;
	public void SelectEssentials() throws InterruptedException {
		 action =new Actions(driver);
		 Thread.sleep(5000);
		action.moveToElement(essential).perform();
	}
	
	//To select appliances
	
	@FindBy(xpath="//a[text()='Appliances']")
	WebElement appliences;
	public void selectAppliences() {
		appliences.click();
	}
	//To select skin care 
	@FindBy(xpath="//a[text()='Skincare']")
	WebElement skincare;
	public void selectSkincare() {
		skincare.click();
	}
	//To select hair care
	
	@FindBy(xpath="//a[text()='Haircare']")
	WebElement haircare;
	public void selectHaircare() {
		skincare.click();
	}
	//To select body care
	
	@FindBy(xpath="//a[text()='Baby Care']")
	WebElement bodycare;
	public void selectBodycare() {
		bodycare.click();
	}


}
