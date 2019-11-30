package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.Addtocart;

public class addtocarttest {
	
	Addtocart ac;
	
	public addtocarttest() {
		ac=new Addtocart();
	}
	
	@Test
	
	public void addtocartest() throws InterruptedException {
		
Assert.assertTrue(ac.addtocart().isDisplayed(), "failed");
	}
	

}
