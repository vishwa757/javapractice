package com.qa.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase 
{
	public static WebDriver driver;
	
	
	
	
	
	
	@BeforeMethod
	
	public void setup()
	{
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("please provide valid browser");
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
		
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
