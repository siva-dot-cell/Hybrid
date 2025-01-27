package annotations;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationCount {
	
	@BeforeMethod()
	
	public void before()
	
	{
		Reporter.log("before running method",true);
	}
	
	@Test(invocationCount = 5)
	public void TC1()
	
	{
		Reporter.log("TC1 running",true);
	}

}
