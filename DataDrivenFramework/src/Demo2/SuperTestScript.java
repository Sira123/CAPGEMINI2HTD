package Demo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Demo1.ExcelOperation;

public class SuperTestScript
{
	
	 public static WebDriver driver ;
	 String browser=ExcelOperation.readData("preConfig",1,0);
	 String url=ExcelOperation.readData("preConfig",1,1);

   @BeforeTest
   public void preConfig()
   {
	   if(browser.equalsIgnoreCase("firefox")){
	   System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe"); 
		 driver=new FirefoxDriver();
		 }
	   else if(browser.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "G:\\drivers\\chromedriver.exe"); 
		   driver=new ChromeDriver();
		  }
	   else if(browser.equalsIgnoreCase("ie"))
	   {
		   System.setProperty("webdriver.ie.driver", "G:\\drivers\\MicroSoftWebDriver.exe"); 
		   driver=new InternetExplorerDriver();
	    }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
   }
   
   
	@AfterTest
   public void postConfig()
   {
	   
	   driver.close();
   }
}
