package com.qa.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener
{
	// Listener Setup --- Right click >> Source >> Implement all method

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test execution started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test execution Completed sucessfully");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test execution failed");
		Utilclass.TakeSS(result.getName() + System.currentTimeMillis());
		System.out.println("Screenshot captured");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
	
	}
		
		

	@Override
	public void onFinish(ITestContext context)
	{
		
		
	}
	
	
}
