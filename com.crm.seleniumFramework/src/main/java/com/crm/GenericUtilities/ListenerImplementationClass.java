package com.crm.GenericUtilities;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;

public class ListenerImplementationClass implements ITestListener{

	public void onTestStart(ITestResult result) {
				
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		System.out.println(testname+"Execute");
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sDriver);
		File srcFile = edriver.getScreenshotAs(OutputType.FILE);
		try
		{
			File destFile = new File("./com.crm.seleniumFramework/Screenshot"+testname+".png");
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
