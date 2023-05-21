package com.qa.testlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Logintest extends Testbase
{
	
	@Test
	public void check_login_functionality() throws InterruptedException
	{
		Loginpage c = new Loginpage();
		Thread.sleep(2000);
		c.enter_username("standard_user");
		Thread.sleep(2000);
		c.enter_password("secret_sauce");
		Thread.sleep(2000);
		c.click_on_Login_button();
		Thread.sleep(2000);
		
		
		String expected_result = "Swag Labs";
		String actual_result = driver.getTitle();
		Assert.assertEquals(expected_result,actual_result);
		Thread.sleep(2000);
		
		System.out.println("verifying presence of logo");
		WebElement logo = driver.findElement(By.className("app_log0"));
		Assert.assertTrue(logo.isDisplayed());
		
	}
	
	

}
