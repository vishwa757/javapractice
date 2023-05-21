package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class Loginpage extends Testbase
{
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//=================object repository=============
	
	@FindBy (xpath = "//input[@id='user-name']")
	private WebElement username;
	

	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@name='login-button']")
	private WebElement login_button;
	
	//==================Action Methods===============
	
	public void enter_username(String name)
	{
		username.sendKeys(name);
	}
	
	public void enter_password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void click_on_Login_button()
	{
		login_button.click();
	}
	
	

}
