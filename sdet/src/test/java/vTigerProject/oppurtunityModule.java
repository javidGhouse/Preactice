package vTigerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class oppurtunityModule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Javid Ghouse\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri = new ChromeDriver(); 
		dri.manage().window().maximize();
		dri.get("http://localhost:8888/index.php?action=Login&module=Users");
		Thread.sleep(5000); dri.findElement(By.name("user_name")).sendKeys("admin");
		dri.findElement(By.name("user_password")).sendKeys("admin");
		dri.findElement(By.id("submitButton")).click();
		
		dri.findElement(By.name("potentialname")).sendKeys("Shah Electronics");
		dri.findElement(By.xpath("//input[@id='related_to_display']")).sendKeys("");
		

	}

}
