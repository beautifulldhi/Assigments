package com.OpenCart.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver WebDriverApplication(WebDriver driver,String browsername,String appUrl)
	{
		driver=new ChromeDriver();
		driver.get(appUrl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
        return driver;
        
	}

}
