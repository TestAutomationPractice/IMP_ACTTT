package com.netBankingV1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "Login")
	WebElement clickLoginLink;
	
	@FindBy(name = "password")
	WebElement setusername;

	@FindBy(name = "username")
	WebElement setpassword;
	
	@FindBy(name = "Cancle")
	WebElement clickLoginButton;
	
	public void clickLoginlink()
	{
		clickLoginLink.click();
	}

	public void setUserName(String uname)
	{
		setusername.sendKeys(uname);
	}
	
	public void setUserPassword(String pwd)
	{
		setpassword.sendKeys(pwd);
	}
	
	public void clickLoginButton()
	{
		clickLoginButton.click();
	}
	
}
