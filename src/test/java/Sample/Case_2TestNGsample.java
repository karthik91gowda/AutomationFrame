package Sample;

import org.testng.annotations.Test;

public class Case_2TestNGsample {
	
	@Test (priority = 1,invocationCount = 3)
public void createuser()
{
	System.out.println("user created");
} 
	
	@Test (priority = 2 , dependsOnMethods = {"createuser"})
public void modifyuser()
{
	System.out.println("user modified");
}
	
	@Test (priority = 3)
public void deleteuser()
{
	System.out.println("user deleted");
}

}