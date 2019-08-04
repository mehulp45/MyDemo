package com.banking.listners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.banking.utils.Base;

public class CustomeListner implements ITestListener{
	WebDriver driver;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		//System.out.println(result.getName() +"Failed ScreenShot ");
		try {
			Base.captureScreen(result.getName());
			System.out.println("ScreenShot Taken");
		} catch (Exception e) {
			System.out.println("ScreenShot Not Taken"+e.getMessage());
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() +"Test skiped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
