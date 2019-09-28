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
	
	@FindBy(name = "username")
	WebElement setusername;

	@FindBy(name = "password")
	WebElement setpassword;
	
	@FindBy(name = "Login")
	WebElement clickLoginButton;
	
	@FindBy(xpath = "//*[text()='#']")
	WebElement clickHash;
	
	@FindBy(xpath = "//*[text()='add movie']")
	WebElement clickAddMovie;
	
	@FindBy(name = "title")
	WebElement settitle;
	

	@FindBy(name = "director")
	WebElement setdirector;
	

	@FindBy(name = "description")
	WebElement setdescription;
	
	@FindBy(xpath = "//*[text()='Comedy']")
	WebElement selectComedy;

	@FindBy(xpath = "//*[text()='Drama']")
	WebElement selectDrama;

	@FindBy(xpath = "//*[text()='Thriller']")
	WebElement selectThriller;
	
	@FindBy(xpath = "//*[text()='Save Movie']")
	WebElement clickSaveMovie;
	
	@FindBy(xpath = "//*[@fill='black'][1]")
	WebElement clickRating;
	
	@FindBy(name = "file")
	WebElement setFile;
	
	public void clickSaveMovie()
	{
		clickSaveMovie.click();
	}
	
	public void clickRating()
	{
		clickRating.click();
	}
	
	public void setFile(String file)
	{
		setFile.sendKeys(file);
	}
	
	public void setTitle(String title)
	{
		settitle.sendKeys(title);
	}
	
	public void setDirector(String director)
	{
		setdirector.sendKeys(director);
	}
	
	public void setDescription(String description)
	{
		setdescription.sendKeys(description);
	}
	
	
	public void selectComedy()
	{
		selectComedy.click();
	}
	
	public void selectDrama()
	{
		selectDrama.click();
	}
	
	public void selectThriller()
	{
		selectThriller.click();
	}
	
	
	public void clickHash()
	{
		clickHash.click();
	}

	
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
	
	public void clickAddMovie()
	{
		clickAddMovie.click();
	}
	
}
