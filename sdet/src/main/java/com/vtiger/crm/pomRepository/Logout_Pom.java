package com.vtiger.crm.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.generic.utilities.webDriverUtilities;



public class Logout_Pom extends webDriverUtilities {
 
		WebDriver dri;
		webDriverUtilities wb = new webDriverUtilities();
		
	public  Logout_Pom(WebDriver dri)
	{
		this.dri=dri;
	PageFactory.initElements(dri,this);
	}
	
	@FindBy(xpath="//span[text()=' Administrator']/following::img[1]")
	private WebElement signHover;
	
	
		
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;

	public WebElement getSignHover() {
		return signHover;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	
public void signOut() {
	
	Logout_Pom lo = new Logout_Pom(dri);
	webDriverUtilities wb = new webDriverUtilities();
	wb.mouseHover(dri, lo.getSignHover());
	lo.getSignOut().click();
	
}
	

}
