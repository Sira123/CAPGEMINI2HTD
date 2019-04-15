package AutomationFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demo2.SuperTestScript;

public class OpenTaskPage {
	
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	

	public OpenTaskPage()
	{
      PageFactory.initElements(SuperTestScript.driver,this);		
 	}
	
	public String retriveTitleOfPage()
	{
		return SuperTestScript.driver.getTitle();
		 
	}
	
	public void clickOnLogout()
	{
		logoutButton.click();
	}
}
