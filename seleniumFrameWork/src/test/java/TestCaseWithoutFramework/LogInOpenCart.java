package TestCaseWithoutFramework;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.OpenCart.Utility.BrowserFactory;
import com.OpenCart.Utility.ExcelUtilty;
import com.Openart.pages.BaseClass;
import com.Openart.pages.LogInPage;
import com.aventstack.extentreports.ExtentTest;
  
public class LogInOpenCart extends BaseClass  {
	@Test
	public void logInApp() throws Exception { 
		
	    loggers = report.createTest("login in sauce.com");
		LogInPage loginOpen = PageFactory.initElements(driver, LogInPage.class);
		loggers.info("started the application");
        loginOpen.username(xlib.ToReadDataFromExcel("login", 0, 0));
        loginOpen.pword(xlib.ToReadDataFromExcel("login", 0, 1));
        loginOpen.clickbtn();
        loggers.pass("login Sucess");
       } }
