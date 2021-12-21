package readUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import fileUtility.propertiesFileUtility;

public class loginByUsingProperty {
	
	public void readDataFrompropertyByIpath() throws Exception 
	{
		propertiesFileUtility pfu=new propertiesFileUtility();
		String un=pfu.readDataFromProperty("username");
		String pwd=pfu.readDataFromProperty("password");
		String url=pfu.readDataFromProperty("url");
		String brow=pfu.readDataFromProperty("chrome");
		WebDriver dri=new ChromeDriver();
		dri.get(url);
		dri.findElement(By.xpath("//input[@name='user_name']")).sendKeys(un);
		dri.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
		dri.findElement(By.id("submitButton")).click();

		
	}

}
