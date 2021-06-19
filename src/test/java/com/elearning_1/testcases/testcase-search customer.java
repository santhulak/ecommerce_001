package com.elearning_1.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elearning_1.pageobjectmodel.loginpage;



public class testcase1 extends baseclass
{
	@Test
	  
	public void logintest()
	 
	{
		 
	 driver.get(baseURL);

	logger.info("url launched");	 
	 loginpage lp = new loginpage(driver);

		  lp.setUserName(username);
		
			logger.info("Entered username");	 


		  lp.setPassword(password);
		  logger.info("Entered password");	
	

		  
	lp.clickSubmit();
		
	logger.info("clicked login button");	 
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))

		  {
			   Assert.assertTrue(true);
			   logger.info("Testcase passed");	
			   		 
	}
		 
	 else
		  
	{
			 
	 Assert.assertTrue(false);
	 logger.info("Testcase failed");	
			  
		  
	}
	  
	}

	}


