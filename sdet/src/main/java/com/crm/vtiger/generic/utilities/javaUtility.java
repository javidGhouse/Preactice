package com.crm.vtiger.generic.utilities;


import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;


public class javaUtility {

	/**
	 * this method is used to get a random number and return the rnum
	 * @return
	 */
			
	public int getRandomNumber() 
	{
		Random rn=new Random();
		int rnum = rn.nextInt(1000);
		return rnum;
	}
	
	
	public String getSystemDate()
	{
		Date date=new Date();
		String sysDate =date.toString().replace(" ", "_").replace(":", "_");
		//System.out.println(sysDate);
		return sysDate;
	}
	
	
	public void pressVirtualEnterKey()
	{
		//Robot rb=new Robot();
		
	}
	
}
