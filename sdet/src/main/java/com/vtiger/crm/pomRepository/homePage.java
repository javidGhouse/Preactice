package com.vtiger.crm.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.generic.utilities.webDriverUtilities;

public class homePage  extends webDriverUtilities {
	
	 WebDriver dri;
	 webDriverUtilities wb=new webDriverUtilities();
	public homePage(WebDriver dri)
	{
	
		this.dri=dri;
		PageFactory.initElements(dri, this);
	}
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement OrganizationLink;
	
	public WebElement getOrganizationLink()
	{
		OrganizationLink.click();
		return OrganizationLink;
	}
	
	

}