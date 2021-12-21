package com.vtiger.crm;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import fileUtility.BaseClass;

public class LeadsTest extends BaseClass {
	
	
	@Test
	public void leads_ts1()
	{
		
		
		Select se=new Select(dri.findElement(By.xpath("//select[@name='salutationtype']")));
		se.selectByVisibleText("Mr.");
		dri.findElement(By.xpath("//input[@name='firstname']")).sendKeys("karapakkam");
		dri.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		dri.findElement(By.xpath("//input[@name='company']")).sendKeys("SN ELECTRONICS");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc2() 
	{
		
		
		dri.findElement(By.xpath("//input[@id='designation']")).sendKeys("TITLE");
		Select se1=new Select(dri.findElement(By.xpath("//select[@name='leadsource']")));
		se1.selectByVisibleText("Conference");
		
		Select se2=new Select(dri.findElement(By.xpath("//select[@name='industry']")));
		se2.selectByVisibleText("Electronics");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc3()
	{
	
		dri.findElement(By.xpath("//input[@name='annualrevenue']")).sendKeys("1570000");
		dri.findElement(By.xpath("//input[@name='noofemployees']")).sendKeys("15");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc4() 
	{
		
		dri.findElement(By.xpath("//input[@id='secondaryemail']")).sendKeys("mnm@gmail.com");
		dri.findElement(By.xpath("//input[@id='phone']")).sendKeys("04175238724");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc5()
	{
		dri.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8807862748");
		dri.findElement(By.xpath("//input[@id='fax']")).sendKeys("123456");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc6()
	{
		dri.findElement(By.xpath("//input[@id='email']")).sendKeys("artjavid20@gmail.com");
		dri.findElement(By.xpath("//input[@name='website']")).sendKeys("khwebsite");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc7() 
	{
		Select se3=new Select(dri.findElement(By.xpath("//select[@name='leadstatus']")));
		se3.selectByVisibleText("Contacted");
		
		Select se4=new Select(dri.findElement(By.xpath("(//select[@class='small'])[6]")));
		se4.selectByVisibleText("Active");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc8()
	{
		dri.findElement(By.xpath("//input[@name='assigntype']")).click();
		dri.findElement(By.xpath("//textarea[@name='lane']")).sendKeys("131/4,abc,chennai");
		dri.findElement(By.xpath("//input[@id='pobox']")).sendKeys("PO Box");
		dri.findElement(By.id("code")).sendKeys("606601");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc9()
	{
		dri.findElement(By.id("city")).sendKeys("Chennai");
		dri.findElement(By.id("country")).sendKeys("India");
		dri.findElement(By.name("button")).click();
	}
	
	@Test
	public void leads_tc10() {
		dri.findElement(By.id("state")).sendKeys("Tamil Nadu");
		dri.findElement(By.name("description")).sendKeys("description writing");
		dri.findElement(By.name("button")).click();
	
		dri.findElement(By.xpath("//a[text()='Leads']")).click();
	
	}
	
	public void assertMethod()
	{
		String expectedRes="LEA1";
		
		String actualRes=dri.findElement(By.xpath("//td[text()='LEA1 ']")).getText();
	
		System.out.println(actualRes);
		assertEquals(expectedRes, actualRes);
	}		
	
	
}
