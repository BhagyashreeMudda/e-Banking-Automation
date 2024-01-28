package com.eBanking.Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class LsitenerReporting implements ITestListener
{
	
	public void onStart(ITestContext context)
	{
		System.out.println("Test Case started");
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case success");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case failed");
	}

}
