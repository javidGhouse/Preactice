package com.vtiger.crm.organization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class org_ts1 {

	public void organ_testscript() throws Exception
	{

	
	  //sc_1
	  
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver dri = new ChromeDriver();
	  dri.manage().window().maximize();
	  dri.get("http://localhost:8888/index.php?action=Login&module=Users");
	  Thread.sleep(5000); 
	  dri.findElement(By.name("user_name")).sendKeys("admin");
	  dri.findElement(By.name("user_password")).sendKeys("admin");
	  dri.findElement(By.id("submitButton")).click();
	  dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	  dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]")).click();
	  dri.findElement(By.xpath("//input[@name='accountname']")).
	  sendKeys("sriram laptops Name");
	  dri.findElement(By.xpath("//input[@name='assigntype'")).click();
	 


	}
	}
