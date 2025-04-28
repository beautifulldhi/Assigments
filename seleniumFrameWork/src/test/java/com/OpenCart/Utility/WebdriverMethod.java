package com.OpenCart.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.Openart.pages.BaseClass;
public class WebdriverMethod extends BaseClass{
	
	public static String capturescreenshot(String testcase)
	{
		File src= ((TakesScreenshot) driver) .getScreenshotAs(OutputType.FILE);;
		
		String ScreenshotPath=System.getProperty(("user.dir")+"\\Screenshot\\"+testcase+".png");
		
		try {
			FileHandler.copy(src, new File(".\\Screenshot"+testcase+".png"));
		} catch (IOException e) {
			System.out.println("screenshotcaptured");
		}
		return ScreenshotPath;
		}}
