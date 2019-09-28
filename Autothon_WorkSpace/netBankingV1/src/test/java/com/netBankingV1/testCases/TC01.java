package com.netBankingV1.testCases;

import org.testng.annotations.*;

import com.netBankingV1.pageObject.HomePage;
import com.netBankingV1.pageObject.LoginPage;

public class TC01 extends BaseClass1{
	
	@Test
	public void loginTest() throws Exception
	{
		driver.get(baseUrl);
		logger.info("URL is Opened");
		HomePage hp = new HomePage(driver);
		
		hp.clickLoginlink();
		
		hp.setUserName(useruser);
		logger.info("User name Entered");
		
		hp.setUserPassword(password);
		logger.info("Password Entered");
		
		hp.clickLoginButton();
		
	}

}
