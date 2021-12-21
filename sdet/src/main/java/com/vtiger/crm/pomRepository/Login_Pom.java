package com.vtiger.crm.pomRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.generic.utilities.webDriverUtilities;

import fileUtility.propertiesFileUtility;

public class Login_Pom extends webDriverUtilities {
	
	WebDriver dri;
		//Login_Pom lp=new Login_Pom(dri);
		propertiesFileUtility pfu=new propertiesFileUtility();
		webDriverUtilities wdu=new webDriverUtilities();
		
		public  Login_Pom(WebDriver dri)
		{
			this.dri=dri;
		PageFactory.initElements(dri,this);
		}
	
		@FindBy(xpath = "//div[text()='User Name']/following::input[1]")
		private WebElement username;

		public WebElement getUserName() throws IOException
		{
			
		return username;	
		}
		
		@FindBy(name="user_password")
		private WebElement password;
	
		public WebElement getpassword() throws IOException
		{
			return password;
		}
	
		@FindBy(id="submitButton")
		private WebElement submit;
		
		public WebElement LoginClick()
		{
			return submit;
		}
		
		
		public void loginClick(String un,String pwd) throws Exception
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
			submit.click();
		}
		
	
}
