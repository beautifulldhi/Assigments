package EcommerenceTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Ecommerence.AddCartClass;
import Ecommerence.LandingPagepageobject;

public class ToAddCart {
	public static void main(String[] args)  {
		String productname = "iphone 16e";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		//calling landpage where we open browser
		LandingPagepageobject LandingPage= new LandingPagepageobject(driver);
	    LandingPage.browseropen();
	  //calling actions of page
	    AddCartClass cartbutton= new AddCartClass(driver);
	    cartbutton.searchbox("iphone 16e");
	    cartbutton.ActualPrice(productname);
		
	//	driver.findElement(By.id("a-autoid-1-announce")).click();
		  //actuaaal price(//span[@class="a-price"])[1]
	
		 System.out.println("=================");
	        List<WebElement> alllinks = driver.findElements(By.tagName("h2"));
	        for(WebElement links:alllinks) {
	        	String linktext = links.getText();
	        	String linkurl = links.getAttribute("aria-label");
	        	System.out.println(linktext+ " = " +linkurl);
	        }
		}
}
