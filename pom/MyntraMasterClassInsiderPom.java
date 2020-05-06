package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraMasterClassInsiderPom {
	
	public MyntraMasterClassInsiderPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='Masterclass from Celeb Stylists']")
	WebElement masterclass;
	public void masterClassFromCelebStyle() {
		masterclass.click();
	}
	@FindBy(xpath = "//div[text()='Know more']")
	WebElement masterclassknow;
	public void masterClassFromCelebStyleKnow() {
		masterclassknow.click();
	}
}
