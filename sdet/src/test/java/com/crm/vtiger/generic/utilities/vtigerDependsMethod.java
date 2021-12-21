package com.crm.vtiger.generic.utilities;

import org.testng.annotations.Test;

public class vtigerDependsMethod {

	
	@Test
	public void driverLaunch()
	{
		webDriverUtilities wu=new webDriverUtilities();
		
		wu.getUrl("http://localhost:8888/index.php?action=Login&module=Users");
		
	}
	
	@Test(dependsOnMethods="driverLaunch")
	public void userName()
	{
		
	}
	
	

}
