package AutomationFramework;

import org.testng.annotations.Test;

import Demo2.SuperTestScript;

public class LoginLogoutTC_01  extends SuperTestScript
{
    @Test  
	public void testLoginLogoutTC_01()
	{
	  //step 1 fetch all neccessary data
   String username=ExcelOperation,
   String password=////
   String expectedResult=;;;
   
   
   //Step 2 create necceesary page objects
   LoginPage lp=new LoginPage();
   OpenTaskPage otp=new OpenTaskPage();
  //Step 3 convert testcase into testsCripts
   
   lp.enterUsername(username);
   lp.enterPassword(password);
   lp.clickOnLogin();
   String actualResult = otp.retriveTitleOfPage();
   otp.clickOnLogout();
   //Step 4 validate 
   String status= ValidationOperation.verify(expectedResult, actualResult);
   //Step5 write data into excel
   
   
		
	}
	
}
