package com.capgemini.stepDefination;

import static org.testng.Assert.assertEquals;

import com.capgemini.base.Base;
import com.capgemini.pom.MyntraInsiderPom;
import com.capgemini.pom.MyntraMasterClassInsiderPom;
import com.capgemini.pom.MyntraMasterClassInsiderVideoPom;
import com.capgemini.pom.ProfilePom;

import cucumber.api.java.en.Then;

public class StepDefinationMyntraInsiderVedio extends Base {
	ProfilePom p;
	MyntraInsiderPom myntrainsider;
	MyntraMasterClassInsiderPom masterclass;
	MyntraMasterClassInsiderVideoPom video;

	@Then("^click on myntra insider under profle$")
	public void click_on_myntra_insider_under_profle() throws Throwable {
		Thread.sleep(5000);
		p = new ProfilePom(driver);
		p.profile();
		myntrainsider=new MyntraInsiderPom(driver);
	
		myntrainsider.myntraInsiderButton();

	}

	@Then("^click on Master class celeb Stylist$")
	public void click_on_Master_class_celeb_Stylist() throws Throwable {
		masterclass=new MyntraMasterClassInsiderPom(driver);
		masterclass.masterClassFromCelebStyle();
	}

	@Then("^Click on know more$")
	public void click_on_know_more() throws Throwable {
		masterclass=new MyntraMasterClassInsiderPom(driver);
		masterclass.masterClassFromCelebStyleKnow();
	}

	@Then("^Click on play video$")
	public void click_on_play_video() throws Throwable {
		video=new MyntraMasterClassInsiderVideoPom(driver);
		video.playVideo();
		
	}
	
	@Then("^Click on mute video$")
	
	public void click_on_mute_video() throws Throwable {
		video=new MyntraMasterClassInsiderVideoPom(driver);
		Thread.sleep(5000);
		video.muteVideo();
	}

	@Then("^Click on Unmute video$")
	public void click_on_Unmute_video() throws Throwable {
		video=new MyntraMasterClassInsiderVideoPom(driver);
		Thread.sleep(5000);
		video.unMuteVideo();
	}

	@Then("^Click on pause video$")
	public void click_on_pause_video() throws Throwable {
		video=new MyntraMasterClassInsiderVideoPom(driver);
		Thread.sleep(5000);
		video.pauseVideo();
	
	String title = driver.getTitle();
	

	assertEquals(title, "Myntra Insider Masterclass: The Best Fashion E-commerce Loyalty Program in India");
	System.out.println(title);
	}

}
