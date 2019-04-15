package Demo1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	public static void main(String[] args) {
		
    System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe"); 
		 FirefoxDriver ff=new FirefoxDriver();
		 ff.get("http://localhost:8888/index.php?action=Login&module=Users");
	      ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 ff.findElement(By.name("user_name")).sendKeys("admin");
		 ff.findElement(By.name("user_password")).sendKeys("root");
		 ff.findElement(By.id("submitButton")).click();
		  ff.findElement(By.linkText("More")).click();
		 //Actions a1=new Actions(ff);
		// a1.moveToElement(more).build().perform();
		 ff.findElement(By.linkText("Invoice")).click();
		 ff.findElement(By.xpath("//a//img[@alt='Create Invoice...']")).click();
		 ff.findElement(By.xpath("//tbody//tr[8]//td[2]//img[1]")).click();
		 Set<String> i1 = ff.getWindowHandles();
		 
		 Iterator<String> a = i1.iterator();
		 String main = a.next();
		     String child = a.next();
		  ff.switchTo().window(child);
		  ff.findElement(By.id("search_txt")).sendKeys("sira");
		  
		 
           		 
		 
		
		
		
	}

}
