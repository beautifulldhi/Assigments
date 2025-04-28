package Ecommerence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartClass {
    WebDriver driver;
    public AddCartClass(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
	}
    
    /*//text in the textfield
     * //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16e");
     */
    @FindBy(id="twotabsearchtextbox")
    WebElement tabtosearchtextbox;
    
  /*click on serach button
    driver.findElement(By.id("nav-search-submit-button")).click();
   */
	@FindBy(id="nav-search-submit-button")
    WebElement submitbutton;
	
    /*here the calling Actions methods are written
	 * 
	 */
	  public void searchbox(String productname) {
    	tabtosearchtextbox.sendKeys(productname);
    	submitbutton.click();
		
    	 }
	  /*compare to price  
	   */
    public void ActualPrice( String productname) {
    	 
    	  String expectedPrice="₹59,900";
  	    String actualPrice = driver.findElement(By.xpath("(//span[@class=\"a-price\"])[1]")).getText();
  	    System.out.println(actualPrice);
  		if (actualPrice.equals(expectedPrice)) {
  			System.out.println("pass");
  		}else {
  			System.out.println("pass");
  		}
  	   
	}
    
    
}
