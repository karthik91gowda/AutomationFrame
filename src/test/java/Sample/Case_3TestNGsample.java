package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Case_3TestNGsample 
{
	
	@Test
	public void createuser()
	{
		System.out.println("user created");
	} 
		
  //@Test (enabled = false)
	@Test (invocationCount = 0)
	public void modifyuser()
	{
		System.out.println("user modified");
	}
		
		@Test               
		@Ignore
	public void deleteuser()
	{
		System.out.println("user deleted");
	}
}