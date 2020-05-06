package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.Base;

public class EssentialsPom extends Base{
	//WebDriver driver;
	Actions action;
	
public EssentialsPom(WebDriver driver) {
	PageFactory.initElements(driver, this);
}	


@FindBy(className="product-base")
WebElement item;

public void selectProduct() throws InterruptedException {
	action=new Actions(driver);
	Thread.sleep(5000);
	action.moveToElement(item).perform();
}
@FindBy(xpath="//span[text()='Add to bag']")
WebElement bag;

public void clickAddToBag() throws InterruptedException {
	
	bag.click();
}
//@FindBy(xpath="//button[text()='Onesize']")
//WebElement size;
//
//public void selectProductSize() {
//	
//	size.click();
//}
@FindBy(xpath="//button[@class=\"product-sizeButton\"]")
WebElement size;

public void selectProductSize(){
	
	size.click();
}
}


