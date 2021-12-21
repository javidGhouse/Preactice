package com.vtiger.crm.organization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import fileUtility.BaseClass;

public class org_ts2 extends BaseClass{

	WebDriver dri;
	@Test
	public void leadtestscript1() throws Exception
	{
		
	
	  
	  dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	  dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]"
	  )).click();
	  
	  WebElement we=dri.findElement(By.xpath("//select[@name='industry']"));
	  Actions act=new Actions(dri); act.moveToElement(we).click().perform();
	  
	  WebElement we1=dri.findElement(By.
	  xpath("//span[text()=' Administrator']/following::img[1]"));
	  act.moveToElement(we1).perform(); //WebElement
	  //we2=dri.findElement(By.xpath("//a[text()='Sign Out']"));
	  //act.moveToElement(we2).click().build();
	 
	 
	  
	  
}	
}
