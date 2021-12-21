package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class readPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("./propertyFile.txt");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String brow=prop.getProperty("browser");
		String user=prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		WebDriver dri=null;
		
		System.setProperty("webdriver.chrome.driver","F:\\driver selenium\\chromedriver_win32.exe");
		
		if(brow.equals("chrome"))
		{
			dri=new ChromeDriver();
		}
		else if(brow.equals("firefox")) 
		{
		dri= new FirefoxDriver();
		}
		else if(brow.equals("ie")){
			dri=new InternetExplorerDriver();
		}
		
		//dri.findElement(By.name("user_name")).sendKeys(user);
		//dri.findElement(By.name("user_password")).sendKeys(pass);

		System.out.println(" "+brow);
		System.out.println(" "+user);
		System.out.println(" "+pass);
		
		//FileOutputStream fos=
		
	}

}
