package com.Openart.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.IOExceptionWithCause;
import org.openqa.selenium.WebDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.OpenCart.Utility.BrowserFactory;
import com.OpenCart.Utility.ExcelUtilty;
import com.OpenCart.Utility.ProperetiesUtility;
import com.OpenCart.Utility.WebdriverMethod;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public static WebDriver driver;
	public ExcelUtilty xlib;
	public ProperetiesUtility config;
	public ExtentReports report;
	public ExtentTest loggers;
         @BeforeSuite
	     public void setupapp() {
		 xlib= new ExcelUtilty();
		 config=new ProperetiesUtility();
		 ExtentSparkReporter htmlreport= new ExtentSparkReporter(".\\Report\\OpenCart.html");
		 report= new ExtentReports();
		 report.attachReporter(htmlreport);
		 report.setSystemInfo("qaurl", "//www.saucedemo.com/");
		 report.setSystemInfo("username", "standard_user");
		 report.setSystemInfo("password", "secret_sauce");
		 report.setSystemInfo("ReportName", "Harshita");
	}
	
	@BeforeClass
	public void startbrowser() throws IOException {
	driver =
	BrowserFactory.WebDriverApplication(driver, config.ToReadDataProperties("Browser"), config.ToReadDataProperties("qaurl"));
	}
	
	
	@AfterMethod
	public void getshoot(ITestResult result)throws Exception {
		String ScreenshotPath = null;
		if(result.getStatus()==ITestResult.SUCCESS)
		{
	
		loggers.addScreenCaptureFromPath(WebdriverMethod.capturescreenshot(ScreenshotPath),result.getMethod().getMethodName());
	    System.out.println(" testcase pass");
		}else if (result.getStatus()==ITestResult.FAILURE) 
		{
		loggers.addScreenCaptureFromPath(WebdriverMethod.capturescreenshot(ScreenshotPath),result.getMethod().getMethodName());
		System.out.println(" testcase fail");
		}
		
	}
		
		//WebdriverMethod wm=new WebdriverMethod();
		//String filepath1 = null;
			
		/*	try {
			 filepath1=wm.capturescreenshot(result.getMethod().getMethodName());
			} catch (Exception e) {
				
			}
			loggers.addScreenCaptureFromPath(filepath1,result.getMethod().getMethodName());
			}
		}*/
	

	@AfterClass
	public void teardown() {
		 driver.close();
		 
	}
	
}
