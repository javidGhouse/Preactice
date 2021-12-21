package com.crm.vtiger.generic.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import fileUtility.IpathConstant;

public class webDriverUtilities {

	
	
	/**
	 * This method is used for waitUntilLoadPage by using Implicit wait.
	 * @param dri
	 */
	public void waitUntilPageLoad(WebDriver dri)
	{
		dri.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	/**
	 * This method will wait until for Element visible by Explicit wait
	 * @param dri
	 * @param ele
	 */
	
	public void waitForElementVisible(WebDriver dri, WebElement ele) 
	{
		WebDriverWait wait=new WebDriverWait(dri, 15);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}
	
	/**
	 * This method is used for wait for Element until Click
	 * @param dri
	 * @param ele
	 */
	public void waitAndClick(WebDriver dri,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(dri, 20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	

	public String SelectDropDownByVisibleText(WebElement ele,String text) 
	{
	Select se=new Select(ele);
	se.selectByVisibleText(text);
	return text;
	}
	
	public int SelectDropDownByIndex(WebElement ele,int index)
	{
		Select se=new Select(ele);
		se.selectByIndex(index);
		return index;
	}
	public String SelectDropDownByVALUE(WebElement ele,String value)
	{
	Select se=new Select(ele);
	se.selectByValue(value);
	return value;
	}
	
	public void mouseHover(WebDriver dri,WebElement ele) 
	{
		Actions act=new Actions(dri);
		act.moveToElement(ele).build().perform();
		ele.click();
	}
	
	public void rightClick(WebDriver dri,WebElement ele)
	{
		Actions act=new Actions(dri);
		act.contextClick(ele).build().perform();
		
	}
	
	public void doubleClick(WebDriver dri,WebElement ele)
	{
		Actions act=new Actions(dri);
		act.doubleClick(ele).build().perform();
	}
	
	/**
	 * @param dri
	 */
	public void SwitchToWindow(WebDriver dri,int index) 
	{
		String parent=dri.getWindowHandle();
		Set<String> child=dri.getWindowHandles();
		for(String result:child)	
		{
			dri.switchTo().window(result);
		}
		
	}
	public void alertPopup(WebDriver dri)
	{
			Alert al=dri.switchTo().alert();
			al.accept();
	}
	
	public void cancelAlert(WebDriver dri)
	{
		Alert al=dri.switchTo().alert();
		al.dismiss();
	}
	
	
	public String PromptPopup(WebDriver dri,String text)
	{
		Alert al=dri.switchTo().alert();
		al.sendKeys(text);
		return al.getText();
	}
	
	public void takeScreenShot(WebDriver dri,String fileLocation,String fileExtension) throws IOException
	{
		File fl=((TakesScreenshot)dri).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,new File(fileLocation+ System.currentTimeMillis()+fileExtension));
	}

	public void switchFrameIndex(WebDriver dri,int index)
	{
		dri.switchTo().frame(index);
	}
	
	public void switchFrameLocator(WebDriver dri,String locator)
	{
		dri.switchTo().frame(locator);
		
	}
	
	public void scrollToWebElement(WebDriver dri,String argument,WebElement ele)
	{
		JavascriptExecutor je=(JavascriptExecutor)dri;
		je.executeScript(argument,ele);
	}
	
	public void driverLaunch()
	{
		WebDriver dri=new ChromeDriver();
	}
	
	public void getUrl(String url)
	{
		WebDriver dri=new ChromeDriver();
		dri.get(url);
	}
	
}
