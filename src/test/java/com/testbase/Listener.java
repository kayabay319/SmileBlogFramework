package com.testbase;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utils.CommonMethods;

public class Listener extends CommonMethods implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started -->"+result.getName());
		test=report.createTest(result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test Pass -->"+result.getName());
	    
		takeScreenShot("passed/"+result.getName());
		
		test.pass("Test Pass "+result.getName());
		
		String imagePath=takeScreenShot("passed/"+result.getName());

		try {
			test.addScreenCaptureFromPath(imagePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail -->"+result.getName());
		
		takeScreenShot("failed/"+result.getName());

		test.fail("Test Fail "+result.getName());
		
		String imagePath=takeScreenShot("failed/"+result.getName());
		
		try {
			test.addScreenCaptureFromPath(imagePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
