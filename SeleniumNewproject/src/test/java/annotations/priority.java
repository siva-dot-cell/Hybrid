package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	
	 @Test (priority=-1)
	
	public void TC1()
	
   
	{
		Reporter.log("TC1 is a priority",true);
		
	}
	 
	 @Test (priority=2)
	 
	 public void TC2()
	 
	 {
		 Reporter.log("Tc2 is priorty",true);
	 }
	 
	 @Test (priority=3)
	 
	 public void C()
	 {
		 Reporter.log("C is running",true);
	 }
	 
@Test (priority=-3)
	 
	 public void B()
	 {
		 Reporter.log("B is running",true);
	 }

@Test (priority=4)

public void D()
{
	 Reporter.log("D is running",true);
}
    
	
	
	
	
}
