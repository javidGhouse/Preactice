package fileUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadPress {	
	
	public void leadMethod(WebDriver dri)
	{
		dri.findElement(By.xpath("//a[text()='Leads']")).click();
		dri.findElement(By.xpath("(//a[text()='Leads'])[2]/following::img[1]")).click();
		
	}

}
