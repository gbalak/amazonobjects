package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.Amazonpageobjects;

public class Amazontestpage {
	
	Amazonpageobjects ao;
	
	public Amazontestpage() {
		ao=new Amazonpageobjects();
	}

	@Test
	
	public void verifyallthetabs() {
		
		Assert.assertTrue(ao.getbestsellers().isDisplayed(), "failed");
		Assert.assertTrue(ao.getgiftideas().isDisplayed(), "failed");
		Assert.assertTrue(ao.getnewrealese().isDisplayed(), "failed");

	}
	
	@Test
	
	public void verifynavigatetoaccount() {
		
		Assert.assertTrue(ao.getaccountstab().contains("Your Account"), "failed");
	}
	
}
