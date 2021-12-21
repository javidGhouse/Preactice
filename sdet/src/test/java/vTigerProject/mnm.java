package vTigerProject;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class mnm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//sc_1
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * WebDriver dri = new ChromeDriver(); dri.manage().window().maximize();
		 * dri.get("http://localhost:8888/index.php?action=Login&module=Users");
		 * Thread.sleep(5000); dri.findElement(By.name("user_name")).sendKeys("admin");
		 * dri.findElement(By.name("user_password")).sendKeys("admin");
		 * dri.findElement(By.id("submitButton")).click();
		 * dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		 * dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]"
		 * )).click(); dri.findElement(By.xpath("//input[@name='accountname']")).
		 * sendKeys("sriram laptops Name");
		 * dri.findElement(By.xpath("//input[@name='assigntype'")).click();
		 */
		
		
		//SC_2
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * WebDriver dri = new ChromeDriver(); dri.manage().window().maximize();
		 * dri.get("http://localhost:8888/index.php?action=Login&module=Users");
		 * Thread.sleep(5000); dri.findElement(By.name("user_name")).sendKeys("admin");
		 * dri.findElement(By.name("user_password")).sendKeys("admin");
		 * dri.findElement(By.id("submitButton")).click();
		 * dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		 * dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]"
		 * )).click();
		 * 
		 * WebElement we=dri.findElement(By.xpath("//select[@name='industry']"));
		 * Actions act=new Actions(dri); act.moveToElement(we).click().perform();
		 * 
		 * WebElement we1=dri.findElement(By.
		 * xpath("//span[text()=' Administrator']/following::img[1]"));
		 * act.moveToElement(we1).perform(); //WebElement
		 * //we2=dri.findElement(By.xpath("//a[text()='Sign Out']"));
		 * //act.moveToElement(we2).click().build();
		 * dri.findElement(By.xpath("//a[text()='Sign Out']")).click();
		 */
		
		
		
			//SC_3
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 * WebDriver dri = new ChromeDriver(); dri.manage().window().maximize();
			 * dri.get("http://localhost:8888/index.php?action=Login&module=Users");
			 * Thread.sleep(5000); dri.findElement(By.name("user_name")).sendKeys("admin");
			 * dri.findElement(By.name("user_password")).sendKeys("admin");
			 * dri.findElement(By.id("submitButton")).click();
			 * dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
			 * dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]"
			 * )).click();
			 * 
			 * Select se=new
			 * Select(dri.findElement(By.xpath("//select[@name='industry']")));
			 * se.selectByVisibleText("Education");
			 * 
			 * 
			 * WebElement we1=dri.findElement(By.xpath("//span[text()=' Administrator" +
			 * "']/following::img[1]"));
			 *  Actions act=new Actions(dri);
			 * act.moveToElement(we1).perform();
			 * dri.findElement(By.xpath("//a[text()='Sign Out']")).click();
			 */
		
			//SC_4 same as SC_2
		
			//SC_5 
			
		
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 * WebDriver dri = new ChromeDriver(); dri.manage().window().maximize();
			 * dri.get("http://localhost:8888/index.php?action=Login&module=Users");
			 * Thread.sleep(5000); dri.findElement(By.name("user_name")).sendKeys("admin");
			 * dri.findElement(By.name("user_password")).sendKeys("admin");
			 * dri.findElement(By.id("submitButton")).click();
			 * dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
			 * dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]"
			 * )).click();
			 * 
			 * dri.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys(
			 * "MangoDB");
			 * 
			 * Select se=new Select(dri.findElement(By.xpath("//select[@class='small']")));
			 * se.selectByVisibleText("Customer");
			 * 
			 * 
			 * WebElement we1=dri.findElement(By.xpath("//span[text()=' Administrator" +
			 * "']/following::img[1]")); Actions act=new Actions(dri);
			 * act.moveToElement(we1).perform();
			 * dri.findElement(By.xpath("//a[text()='Sign Out']")).click();
			 */
		
		
		//SC_6
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * WebDriver dri = new ChromeDriver(); dri.manage().window().maximize();
		 * dri.get("http://localhost:8888/index.php?action=Login&module=Users");
		 * Thread.sleep(5000); dri.findElement(By.name("user_name")).sendKeys("admin");
		 * dri.findElement(By.name("user_password")).sendKeys("admin");
		 * dri.findElement(By.id("submitButton")).click();
		 * dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		 * dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]"
		 * )).click();
		 * 
		 * dri.findElement(By.xpath("//input[@name='account_name']/following::img[1]")).
		 * click(); 
		 * //String pw=dri.getWindowHandle();
		 *  Set<String> cw=dri.getWindowHandles(); 
		 * for(String chw:cw) 
		 * {
		 *  dri.switchTo().window(chw);
		 *   }
		 * dri.findElement(By.xpath("//a[text()='javidcompany']")).click();
		 *  Alert al=dri.switchTo().alert(); al.accept();
		 
		  
		 * WebElement we1=dri.findElement(By.xpath("//span[text()=' Administrator" +
		 * "']/following::img[1]")); Actions act=new Actions(dri);
		 * act.moveToElement(we1).perform();
		 * dri.findElement(By.xpath("//a[text()='Sign Out']")).click();
		 */		 
		
		//SC_7
		
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
				  WebDriver dri = new ChromeDriver(); dri.manage().window().maximize();
				  dri.get("http://localhost:8888/index.php?action=Login&module=Users");
				  Thread.sleep(5000); dri.findElement(By.name("user_name")).sendKeys("admin");
				  dri.findElement(By.name("user_password")).sendKeys("admin");
				  dri.findElement(By.id("submitButton")).click();
				  dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
				  dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]"
				  )).click();
				  
				 dri.findElement(By.xpath("//input[@name='account_name']/following::img[1]")).click();
				 //String pw=dri.getWindowHandle();
				 Set<String> cw=dri.getWindowHandles();
				 
				 for(String chw:cw) {
					dri.switchTo().window(chw);
				 }
				 dri.findElement(By.xpath("//a[text()='javidcompany']")).click();
				 Alert al=dri.switchTo().alert();
				 al.accept();
				  
				 dri.findElement(By.xpath("//input[@name='account_name']/following::input[2]")).click();
				  
				  WebElement we1=dri.findElement(By.xpath("//span[text()=' Administrator" +
				  "']/following::img[1]"));
				 Actions act=new Actions(dri);
				  act.moveToElement(we1).perform();
				  dri.findElement(By.xpath("//a[text()='Sign Out']")).click();

				  
	}

}
