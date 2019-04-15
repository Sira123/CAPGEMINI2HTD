package Demo2;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginLogout  extends SuperTestScript{

	
	@Test
	public void testLoginLogout()
	{
	
		 
		 driver.findElement(By.name("username")).sendKeys(Keys.SHIFT+"a"+Keys.LEFT_SHIFT+"bc");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.className("logoutImg")).click();
	   
	}

}
