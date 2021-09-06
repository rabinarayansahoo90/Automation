package com.vtiger.genericLib;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {





	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
// SCREEN SHORT For Failed Test Case
	@Override
	public void onTestFailure(ITestResult arg0) {
		
		System.out.println("Test case failed");
		System.out.println("Screen shot capturing starts");
		String name = arg0.getName();
		EventFiringWebDriver efwd = new EventFiringWebDriver(BaseClass.monitorDriver);
		
		File actualScreenshot = efwd.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(actualScreenshot, new File("./screenshot1/"+ name +".png"));
		}
		catch(IOException e){
		}
		System.out.println("Screen shot capturing ends");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}


