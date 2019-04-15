package Demo1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BulkElements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe");
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("file:///G:/CapgeminiQuestions/Q1.html");
	    ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   String s=ff.findElement(By.xpath("//table/tr[1]/td")).getText();
	System.out.println("below is the ans");
	   System.out.println(s);
	
	
	}
	}


