package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraInsiderEarnPom {

	public MyntraInsiderEarnPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
			//myntr earn	
			@FindBy(xpath = "//div[text()='EARN']")
			WebElement MyntraEarn;
			public void myntraEarn() {
				MyntraEarn.click();
			}
			@FindBy(xpath = "//a[text()='Collect Now']")
			WebElement Myntracollect;
			public void myntraCollectNow() {
				Myntracollect.click();
			}
			//myntra Earn Select img
			@FindBy(xpath = "//div[@class=\\\"shopandearn-image\\\"]")
			WebElement MyntraEarnImg;
			public void myntraEarnImg() {
				MyntraEarnImg.click();
			}
}
