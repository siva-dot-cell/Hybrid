package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class report {
	@Test(priority = 0)
	
	public void genrateReport()
	{
		System.out.println("Hello");
		Reporter.log("valid home page",true);
	}
	
	@Test(priority =1)
	public void genrateReport1()
	{
		System.out.println("Hello1");
		Reporter.log("valid Home Page",true);
		
	}
	
}
