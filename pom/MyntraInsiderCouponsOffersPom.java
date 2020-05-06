package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraInsiderCouponsOffersPom {
	public MyntraInsiderCouponsOffersPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// Myntr coupons
	@FindBy(xpath = "//span[contains(text(),'Myntra Coupons upto Rs. 500')]")
	WebElement myntraCoupons;
	public void myntraCoupon() {
		myntraCoupons.click();
	}
	
	// coupons explore now
	@FindBy(xpath = "//div[contains(text(),'Explore Now!')]")
	WebElement couponsExplor;
	public void exploreCoupons() {
		couponsExplor.click();
	}
	//Select one image
		@FindBy(xpath="//div[@class=\"card-body\"]")
		WebElement exploreImg;
		public void exploreImgCoupons() {
			exploreImg.click();
			
		
	}
	}

