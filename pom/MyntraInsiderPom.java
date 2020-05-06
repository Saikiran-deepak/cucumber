package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraInsiderPom {
	
	public MyntraInsiderPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//div[text()='Myntra Insider']")
	WebElement myntrainsider;
	public void myntraInsiderButton() {
		myntrainsider.click();
	}
	//Redeem
	@FindBy(xpath ="//div[text()='REDEEM']")
	WebElement myntraRedeem;
	public void RedeemButton() {
		myntraRedeem.click();
		
	}
	
	// points history
	@FindBy(xpath = "//a[text()='Points history']")
	WebElement myntrapointshistory;
	public void myntraInsiderPointsHistory() {
		myntrapointshistory.click();
	}

	// View All button
	@FindBy(xpath = "//a[text()='View all ']")
	WebElement viewAllButton;
	public void viewAllbutton() {
		viewAllButton.click();
	}
	// myntra offers
	@FindBy(xpath = "//div[@class=\"redeem-card offer-disabled\"]")
	WebElement myntraofferImg;
	public void myntraRedeemOffers() {
		myntraofferImg.click();
	}
	@FindBy(xpath = "//div[@class=\\\"card-body\\\"]")
	WebElement myntraofferImgClk;
	public void myntraOfferImgClk() {
	myntraofferImgClk.click();
	}
	// latest insider

	@FindBy(xpath = "//h4[text()='Latest on Insider']")
	WebElement latestInsider;
	public void latestInsider() {
		latestInsider.click();
	}

	// Tyre Icon

	@FindBy(xpath = "//img[@class=\\\"tier-icon\\\"]")
	WebElement TyreIcon;
	public void tyreIconButton() {
		TyreIcon.click();
	}

//==========================================Exclusive Partner offer==============================================	
	
	// Exclusive offers
	@FindBy(xpath = "//span[text()='Exclusive Partner offers upto Rs. 5000 a year']")
	WebElement ExclusiveOffer;
	public void exclusiveOffers() {
		ExclusiveOffer.click();
	}
	//Explore Rewards
	
	@FindBy(xpath = "//div[text()='Explore Rewards']")
	WebElement ExclusiveRewards;
	public void exclusiveRewards() {
		ExclusiveRewards.click();
	}
	
//===========================================Myntra StyleUp=======================================================	
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
//=============================================Myntra Earn=======================================================
	//myntr earn	
	@FindBy(xpath = "//div[text()='EARN']")
	WebElement MyntraEarn;
	public void myntraEarn() {
		MyntraEarn.click();
	}
	//myntra Earn Select img
	@FindBy(xpath = "//div[@class=\\\"shopandearn-image\\\"]")
	WebElement MyntraEarnImg;
	public void myntraEarnImg() {
		MyntraEarnImg.click();
	}
//Myntra clamed	
	@FindBy(xpath = "//div[text()='CLAIMED']")
	WebElement MyntraClamed;
	public void myntraClamed() {
		MyntraClamed.click();
	}
//===============================================See more button
//===============================================================================================================	
//Stages TireBenifits	
	@FindBy(xpath = "//a[text()='See more ']")
	WebElement TireBenifits;
	public void seeMore() {
		TireBenifits.click();
	}
//=======================================Title======================================================	
	
	

}
