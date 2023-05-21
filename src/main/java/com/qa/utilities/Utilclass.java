package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class Utilclass extends Testbase
{
		public Utilclass()
		{
			PageFactory.initElements(driver, this);
		}
		
		public static void TakeSS(String filename) 
		{
				
			String path = "C:\\Users\\kavya\\eclipse-workspace\\SwagLabs_Maven\\screenshot\\";
			try
			{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File destination = new File(path+filename+".png");
				FileHandler.copy(source, destination);
			}
			catch(IOException e)
			{
				System.out.println("File path is wrong");
			}
		}
}
