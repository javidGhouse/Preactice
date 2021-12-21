package com.pom.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.vtiger.crm.pomRepository.Organization_Pom;
import com.vtiger.crm.pomRepository.homePage;

import fileUtility.BaseClass;

@Listeners(fileUtility.ListenerImp.class)
public class createOrganizationsTest extends BaseClass {


	@Test
	public void CreateOrganization() throws Exception {
		
		homePage hp = new homePage(dri);
		Organization_Pom op = new Organization_Pom(dri);

		hp.getOrganizationLink();

		op.getOrgPlus().click();
		

		op.getOrgName();

		op.getWebSite();

		op.getMemberOfMethod();

		Thread.sleep(10000);

	}

}
