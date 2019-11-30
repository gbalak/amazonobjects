package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpageobjects extends Basepage {
	
	@FindBy(linkText="Best Sellers")
	private WebElement bestsellerstab;
	
	@FindBy(linkText="Gift Ideas")
	private WebElement giftideastab;
	
	@FindBy(linkText="New Releases")
	private WebElement newreleasestab;
	
	@FindBy(xpath="//a[@id=\"nav-link-accountList\"]/span[2]")
	private WebElement accountsandlist;
	
	
	@FindBy(xpath="//div[@id=\"nav-al-your-account\"]/a[1]/span")
	private WebElement Youraccount;
	
	
	public Amazonpageobjects() {
		PageFactory.initElements(driver, this);		
	}
	

	public WebElement getbestsellers() {
		return bestsellerstab;
		
		
	}
	public WebElement getgiftideas() {
		return giftideastab;
		
		
	}
	public WebElement getnewrealese() {
		return newreleasestab;
			
	}
	
	public String getaccountstab() {
		Actions action=new Actions(driver);
		action.moveToElement(accountsandlist).build().perform();
		Youraccount.click();
		
		return driver.getTitle();
	}
	
	
	
}


