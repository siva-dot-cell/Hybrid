package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
	@BeforeClass()
	
	public void launchTheBrowser() 
	{
		
		Reporter.log("Successfully launched the browser", true);
	}
	
	@BeforeMethod()
	
	public void loginWithUserIdAndPassword()
	{
		Reporter.log("logged in user name and password", true);
	}
	
	@Test()
	public void validatedTheUserId()
	{
		Reporter.log("validated the user id",true);
	}
	
	@AfterMethod()
	public void logOutTheBrowser()
	
	{
		Reporter.log("logout the browser",true);
	}
	
	@AfterClass()
	public void closedTheBrowser()
	{
	Reporter.log("Closed the browser",true);	
	}
	
	
	
	
	

}
