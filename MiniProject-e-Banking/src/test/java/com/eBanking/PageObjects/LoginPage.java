package com.eBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
	
	//driver
	WebDriver driver;
	
	
	
	//constructor
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//userid field
	
	@FindBy(xpath="//input[@name='uid']")
	@CacheLookup
	private WebElement userID;
	
	
	public void setUserID(String user)
	{
		userID.sendKeys(user);
	}
	
	
	//password field
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	private WebElement password;
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
	//Login Button
	
	@FindBy(xpath="//input[@name='btnLogin']")
	@CacheLookup
	private WebElement loginButn;
	
	public void clickLogBtn()
	{
		loginButn.click();
		
	}
	
	

}
