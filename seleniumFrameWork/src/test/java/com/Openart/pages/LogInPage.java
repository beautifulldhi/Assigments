package com.Openart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OpenCart.Utility.ExcelUtilty;

public class LogInPage extends BaseClass {
	
  WebDriver driver;
  public  LogInPage(WebDriver driver) {
	  this.driver=driver;
	 
	  }

@FindBy(id="user-name") WebElement uname;//standard_user
  @FindBy(id="password")WebElement pword;//secret_sauce
  @FindBy(id="login-button")WebElement logbutton ;
  
  
 public String username(String unameapp) {
	 uname.sendKeys(unameapp);
	 return unameapp;
 }
 public String pword (String pwordapp) {
	 
	pword.sendKeys(pwordapp);
	return pwordapp; 
 }
  
 //actions
 public  void clickbtn() {
	 logbutton.click();
 }
}

  

	



  
  

