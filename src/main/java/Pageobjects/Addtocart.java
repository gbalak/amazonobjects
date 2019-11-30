package Pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart extends Basepage {
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")
	private WebElement frtproductimage;
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement addtocartbutton;
	
	@FindBy(linkText="Proceed to checkout")
	private WebElement proceedbutton;
	
	public Addtocart() {
		PageFactory.initElements(driver, this);
			
		}
		
	
	public WebElement addtocart() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(frtproductimage).build().perform();
		Thread.sleep(2000);
addtocartbutton.click();
return proceedbutton;
	}

}
