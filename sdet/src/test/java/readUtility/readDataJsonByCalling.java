package readUtility;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fileUtility.JasonFileUtility;

public class readDataJsonByCalling {
	
	@Test
	public void loginUsingJson() throws IOException, ParseException
	{
	JasonFileUtility jf=new JasonFileUtility();
	String un=jf.readDataFromJason("username");
	String pwd=jf.readDataFromJason("password");
	String url=jf.readDataFromJason("url");

		
	
	WebDriver dri=new ChromeDriver();
	dri.get(url);
	dri.findElement(By.xpath("//input[@name='user_name']")).sendKeys(un);
	dri.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
	dri.findElement(By.id("submitButton")).click();
	
	
	
	
	}
	
}
