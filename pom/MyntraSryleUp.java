package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraSryleUp {
	public MyntraSryleUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		// Style up
		@FindBy(xpath = "//div[text()='STYLE UP']")
		WebElement styleup;
		public void styleUp() {
			styleup.click();
		}
		//Style Up Share
		@FindBy(xpath = "//a[text()='View all ']")
		WebElement Share;
		public void share() {
			Share.click();
		}
		@FindBy(xpath = "//div[@class=\"masterClass-stylist-container-panel\"]")
		WebElement book;
		public void bookAMasterClass() {
			book.click();
		}

}
