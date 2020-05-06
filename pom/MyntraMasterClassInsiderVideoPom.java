package com.capgemini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraMasterClassInsiderVideoPom {
	public MyntraMasterClassInsiderVideoPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		// Tire Icon Video
		@FindBy(xpath = "//div[@class=\\\"privilege-cta-button\\\"]")
		WebElement videoselect;
		public void video() {
			videoselect.click();
		}
		// Tire Icon Video Play
		@FindBy(xpath = "//div[@class=\"masterClass-stylist-video\"]")
		WebElement videoplay;
		public void playVideo() {
			videoplay.click();
		}

		// Tire Icon Video mute
		@FindBy(xpath = "//button[@title=\"Mute\"]")
		WebElement mute;
		public void muteVideo() {
			mute.click();
		}

		// Tire Icon Video unmute
		@FindBy(xpath = "//button[@title=\"Unmute\"]")
		WebElement unmute;
		public void unMuteVideo() {
			unmute.click();
		}
		// Tyre Icon Video replay
		@FindBy(xpath = "//button[@title=\"Replay\"]")
		WebElement replay;
		public void replayVideo() {
			replay.click();
		}
		@FindBy(xpath = "//div[@class=\"vjs-control-bar\"]")
		WebElement videop;
		public void pauseVideo() {
			videop.click();
		}

		

}
