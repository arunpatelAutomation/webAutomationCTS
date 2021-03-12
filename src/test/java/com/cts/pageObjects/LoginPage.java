package com.cts.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="ctl00$contentbody$txtEmailAddress")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="ctl00_contentbody_ZMbNOEXnLFIMpoBoGQ1ShzsTJIRKFpxerv2llRbl60uEgvH4PMsjJXQuiLgVMQIhFLDbkx2VRUhlAXK3qDbdhbBWTF5iztPxtvlGQWjN4QpbE0c0w86kFqDZO4T725W")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="ctl00$contentbody$btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	
}










