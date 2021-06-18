package com.elearning_1.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginpage {
	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
		
	{
			
	ldriver=rdriver;

	PageFactory.initElements(rdriver, this);

		}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	

			
	@FindBy(name="password")
	WebElement txtPassword	;
		
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	
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