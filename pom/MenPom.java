package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPom {
	WebDriver driver;
	public MenPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Men']")
	WebElement men;
	
	public void men() {
		Actions a=new Actions(driver);
		a.moveToElement(men).perform();
	}
}
