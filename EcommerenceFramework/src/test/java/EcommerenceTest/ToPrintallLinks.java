package EcommerenceTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintallLinks {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//text in the textfield
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16e");
	    //click on serach button
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    //actuaaal price(//span[@class="a-price"])[1]
	    String expectedPrice="₹59,900";
	    String actualPrice = driver.findElement(By.xpath("(//span[@class=\"a-price\"])[1]")).getText();
	    System.out.println(actualPrice);
		if (actualPrice.equals(expectedPrice)) {
			System.out.println("pass");
		}else {
			System.out.println("pass");
		}
        System.out.println("=================");
        List<WebElement> alllinks = driver.findElements(By.tagName("h2"));
        for(WebElement links:alllinks) {
        	String linktext = links.getText();
        	String linkurl = links.getAttribute("aria-label");
        	System.out.println(linktext+ " = " +linkurl);
        }
        
	}

}
