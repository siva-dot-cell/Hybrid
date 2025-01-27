package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class genrateReport {
	@Test
	public void ValidationPin()
	{
		System.out.println("Hello");
		Reporter.log("pinvalidation done",true);
	}
	
	@Test
	
	public void validateUserId()
	{
		Reporter.log("userId Validation is done", true);
	}
	
	@BeforeMethod()
	
	public void EnterUserIdAndPassword()
	{
		Reporter.log("username and password entered", true);
	}
	
	@AfterMethod()
	
	public void signinNutton()
	{
		Reporter.log("signed the login button",true);
	
	}
	
	@BeforeClass()
	 public void launchTheBrowser()
	 {
		Reporter.log("successfully lanched the browser",true);
	 }
	
	@AfterClass()
	public void closeTheBrowser()
	{
		Reporter.log("successfully closed the browser",true);
	}
	
	

}
