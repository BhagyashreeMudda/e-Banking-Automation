package com.eBanking.TestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBanking.PageObjects.LoginPage;



public class TC_LoginTest extends Base
{
	
	
	@Test
	public void loginTest()
	{
		
		
		
		logg.info("URL has been opened");
		logg.error("Error log");
		
		LoginPage logPg=new LoginPage(driver);
		
		logPg.setUserID(userName);
		logg.info("Entered userID");
		logPg.setPassword(passWord);
		logg.info("Entered password");
		logPg.clickLogBtn();
		
		
		//verifying if login is success
		if(driver.getCurrentUrl().contains("https://demo.guru99.com/v3/manager/Managerhomepage.php"))
		{
			Assert.assertTrue(true);
			logg.info("Login Test PASSED");
		}
		else
		{
			Assert.assertTrue(false);
			logg.info("Login Test FAILED");
		}
		
		
		
	}

}
