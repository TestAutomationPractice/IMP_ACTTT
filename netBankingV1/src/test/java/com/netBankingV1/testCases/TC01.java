package com.netBankingV1.testCases;

import org.testng.annotations.*;

import com.netBankingV1.pageObject.HomePage;
import com.netBankingV1.pageObject.LoginPage;

public class TC01 extends BaseClass1{
	
	@Test
	public void loginAdminTest() throws Exception
	{
		driver.get(baseUrl);
		logger.info("URL is Opened");
		HomePage hp = new HomePage(driver);
		
		hp.clickHash();
		
		hp.clickLoginlink();
		
		hp.setUserName(useradmin);
		logger.info("User name Entered");
		
		hp.setUserPassword(password);
		logger.info("Password Entered");
		
		hp.clickLoginButton();
		logger.info("Admin Logged In");
		hp.clickAddMovie();
		logger.info("Add movie Clicked");
		
		hp.setTitle("Chichore");
		logger.info("Title entered");
		hp.setDirector("Maheshalkshdkjsjadkl");
		logger.info("Director Entered");
		hp.setDescription("Movie about college Life , kasjdkjhashdkjkljslkajdlkj");
		logger.info("Description Entered");
		hp.selectComedy();
		logger.info("Comedy Entered");
		hp.selectDrama();
		logger.info("Drama Entered");
		hp.setFile("https://www.bhaskar.com/bollywood/news/first-look-poster-of-chhichhore-starring-shraddha-kapoor-and-sushant-singh-0882833.html");
		logger.info("File url Entered");
		hp.clickRating();
		logger.info("Rating Entered");
		hp.clickAddMovie();
		logger.info("Add movie clicked");
		
		
	}
	
	@Test
	public void loginUserTest() throws Exception
	{
		driver.get(baseUrl);
		logger.info("URL is Opened");
		HomePage hp = new HomePage(driver);
		
		hp.clickHash();
		
		hp.clickLoginlink();
		
		hp.setUserName(useruser);
		logger.info("User name Entered");
		
		hp.setUserPassword(password);
		logger.info("Password Entered");
		
		hp.clickLoginButton();
		logger.info("User Logged In");
		
	}

}
