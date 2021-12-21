package com.vtiger.crm.pomRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.generic.utilities.webDriverUtilities;

public class Organization_Pom extends webDriverUtilities {
	
	public WebDriver dri;
	webDriverUtilities wu=new webDriverUtilities();
	
	public  Organization_Pom(WebDriver dri)
	{
		this.dri=dri;
	PageFactory.initElements(dri,this);
	}
	
	@FindBy(xpath="(//a[text()='Organizations'])[2]/following::img[1]")
	private WebElement orgPlus;
	
	public WebElement getOrgPlus()
	{
		return orgPlus;
	}
	
	@FindBy(name="accountname")
	private WebElement orgName;
	
	public WebElement getOrgName()
	{
		orgName.sendKeys("Test Yantra");
		return orgName;
	}
	
	@FindBy(name="website")
	private WebElement website;
	
	public WebElement getWebSite()
	{
		website.sendKeys("www.Testyantra.com");
		return website;
	}

	@FindBy(id="tickersymbol")
	private WebElement ticketSymbol;
	
	public WebElement getTicketSysmbol()
	{
		ticketSymbol.sendKeys("HR123NM03");
		return ticketSymbol;
	}
	
	@FindBy(xpath="//input[@name='account_name']/following::img[1]")
	private WebElement memberOf;

	@FindBy(xpath="//a[text()='javidcompany']")
	private WebElement windowMemberOf;

	
	
	public void getMemberOfMethod()
	
	{
		webDriverUtilities wu =  new webDriverUtilities();
	
		memberOf.click();
		wu.SwitchToWindow(dri, 1);
		windowMemberOf.click();
		wu.alertPopup(dri);
		wu.SwitchToWindow(dri, 0);

	}
	
	public void getTakeScreenShot() throws IOException
	{
		webDriverUtilities wu =  new webDriverUtilities();
		wu.takeScreenShot(dri, "E:\\Selenium ScreeShot\\img1",".png");
	}
}
