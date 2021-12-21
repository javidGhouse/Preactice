package vTigerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vTiger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("http://localhost:8888/index.php?action=Login&module=Users");
		Thread.sleep(1000);
		dri.findElement(By.name("user_name")).sendKeys("admin");
		dri.findElement(By.name("user_password")).sendKeys("admin");
		dri.findElement(By.id("submitButton")).click();
		dri.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		Thread.sleep(1000);
		dri.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]")).click();
		
		dri.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Javid&Co");
		Select ind=new Select(dri.findElement(By.xpath("//select[@name='industry']")));
		ind.selectByVisibleText("Education");
		WebElement ele=dri.findElement(By.xpath("//input[@name='assigntype'][2]"));
		 ele.click();
		 
		 dri.findElement(By.name("industry")).click();
		 
		 //dri.findElement(By.name("button")).click();
		 
		 dri.findElement(By.xpath("//input[@name='emailoptout']")).click();		 
		 
		 WebElement ele1=dri.findElement(By.xpath("//input[@name='assigntype'][2]"));
		 ele1.click();
		 
		 Select rat=new Select(dri.findElement(By.xpath("//select[@name='rating']")));
		 rat.selectByVisibleText("Active");
		 
		 dri.findElement(By.xpath("//input[@name='notify_owner']")).click();
		 
		 dri.findElement(By.xpath("//input[@name='cpy']")).click();
		 
		 dri.findElement(By.xpath("//input[@name='cpy']")).click();

		 dri.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Shipping suma");
		 
		 dri.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("billling suma");
		 
	}

}
