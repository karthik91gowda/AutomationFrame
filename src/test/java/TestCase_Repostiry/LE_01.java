package TestCase_Repostiry;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.RetryAnalyzerImplementationClass;
import ObjectRepository.CreateNewLeadsPage;
import ObjectRepository.Home_Page;
import ObjectRepository.LeadsHomePage;

@Listeners(Generic_utility.ListernersImplementationClass.class)
public class LE_01 extends BaseClass{
	@Test(retryAnalyzer = RetryAnalyzerImplementationClass.class)
	public void le_01Case() throws Exception{
		
		Java_Utility JUTIL =new Java_Utility();
		int num =JUTIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		
		
		String FIRSTNAME=EUTIL.getIndividualTestDate("Leads",2,1);
		String LASTNAME=EUTIL.getIndividualTestDate("Leads",2,2);
		String COMPANY=EUTIL.getIndividualTestDate("Leads",2,3);
		Thread.sleep(3000);
		
		
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLeads();
		
		LeadsHomePage ip= new LeadsHomePage(driver);
		ip.clickOnNewLeadsButton();
		
		
		CreateNewLeadsPage ch = new CreateNewLeadsPage(driver);
		ch.createLeads(FIRSTNAME+num, LASTNAME, COMPANY);
		System.out.println("test case1 Successfully!");
		
		Thread.sleep(3000);
		
		
		
		
	}

}