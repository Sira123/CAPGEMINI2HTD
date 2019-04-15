package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import Demo3.ExcelOperation;

public class LoginLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  //Step1 Fetch all the neccessary data 
	String url = ExcelOperation.readData("Sheet1", 1, 0);
	String username = ExcelOperation.readData("Sheet1", 1, 1);
	String password = ExcelOperation.readData("Sheet1", 1, 2);
	String ExpectedResult=ExcelOperation.readData("Sheet1", 1, 3);
//Step 2 convert test case into TestScript
	 System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe"); 
	 FirefoxDriver ff=new FirefoxDriver();
	 ff.get(url);
      ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 ff.findElement(By.name("username")).sendKeys(username);
	 ff.findElement(By.name("pwd")).sendKeys(password);
	 ff.findElement(By.xpath("//input[@type='submit']")).click();
	   String actualResult=ff.getTitle();
	   ExcelOperation.writeData("Sheet1", 1, 4, actualResult);
	   if(ExpectedResult.equals(actualResult))
	   {
		   ExcelOperation.writeData("Sheet1", 1, 5, "pass");
		   
	   }
	   
	   else
	   {
		   ExcelOperation.writeData("Sheet1", 1, 5, "fail");
	   }
	 ff.findElement(By.className("logoutImg")).click();
	
		

	}

}
