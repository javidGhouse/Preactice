package vTigerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class leadsModule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri = new ChromeDriver(); 
		dri.manage().window().maximize();
		dri.get("http://localhost:8888/index.php?action=Login&module=Users");
		Thread.sleep(5000); dri.findElement(By.name("user_name")).sendKeys("admin");
		dri.findElement(By.name("user_password")).sendKeys("admin");
		dri.findElement(By.id("submitButton")).click();
		
		dri.findElement(By.xpath("//a[text()='Leads']")).click();
		dri.findElement(By.xpath("(//a[text()='Leads'])[2]/following::a[1]")).click();
		Select se=new Select(dri.findElement(By.xpath("//select[@name='salutationtype']")));
		se.selectByVisibleText("Mr.");
		dri.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Javid");
		dri.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ghouse");
		dri.findElement(By.xpath("//input[@name='company']")).sendKeys("SHAH ELECTRONICS");
		dri.findElement(By.xpath("//input[@id='designation']")).sendKeys("TITLE");
		
		
		Select se1=new Select(dri.findElement(By.xpath("//select[@name='leadsource']")));
		se1.selectByVisibleText("Conference");
		
		Select se2=new Select(dri.findElement(By.xpath("//select[@name='industry']")));
		se2.selectByVisibleText("Electronics");
		
		dri.findElement(By.xpath("//input[@name='annualrevenue']")).sendKeys("5000000");
		dri.findElement(By.xpath("//input[@name='noofemployees']")).sendKeys("3");
		dri.findElement(By.xpath("//input[@id='secondaryemail']")).sendKeys("abc@gmail.com");
		dri.findElement(By.xpath("//input[@id='phone']")).sendKeys("04175238724");
		dri.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8610172173");
		dri.findElement(By.xpath("//input[@id='fax']")).sendKeys("123456");
		dri.findElement(By.xpath("//input[@id='email']")).sendKeys("artjavid20@gmail.com");
		dri.findElement(By.xpath("//input[@name='website']")).sendKeys("ShahWebsite");
		
		Select se3=new Select(dri.findElement(By.xpath("//select[@name='leadstatus']")));
		se3.selectByVisibleText("Contacted");
		
		Select se4=new Select(dri.findElement(By.xpath("(//select[@class='small'])[6]")));
		se4.selectByVisibleText("Active");
		
		dri.findElement(By.xpath("//input[@name='assigntype']")).click();
		dri.findElement(By.xpath("//textarea[@name='lane']")).sendKeys("131/4,abc,thiruvannamalai");
		dri.findElement(By.xpath("//input[@id='pobox']")).sendKeys("PO Box");
		dri.findElement(By.id("code")).sendKeys("606601");
		dri.findElement(By.id("city")).sendKeys("Thiruvannamalai");
		dri.findElement(By.id("country")).sendKeys("India");
		dri.findElement(By.id("state")).sendKeys("Tamil Nadu");
		dri.findElement(By.name("description")).sendKeys("description writing");
		
		
		
		dri.findElement(By.name("button")).click();
		
		

		
	}

}
