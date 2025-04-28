package Ecommerence;

import org.openqa.selenium.WebDriver;
public class LandingPagepageobject  {
   //when we create the framework first we have to create consturcter for our framework
    WebDriver driver;//this is local driver
    public LandingPagepageobject  (WebDriver driver) {
	 this.driver=driver;	
	}
	
    public void browseropen() {
    	driver.get("https://www.amazon.in/");
	}
}
  

