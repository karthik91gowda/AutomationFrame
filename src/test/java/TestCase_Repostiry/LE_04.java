package TestCase_Repostiry;

import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.Java_Utility;
import ObjectRepository.CreateNewLeadsPage;
import ObjectRepository.Home_Page;
import ObjectRepository.LeadsHomePage;

public class LE_04 extends BaseClass {	
	@Test
	public void le_04Case() throws Exception{
		Java_Utility JTUIL =new Java_Utility();
		int num =JTUIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		String FIRSTNAME=EUTIL.getIndividualTestDate("leads", 2,1);
		String LASTNAME=EUTIL.getIndividualTestDate("leads", 2,2);
		String COMPANY=EUTIL.getIndividualTestDate("leads", 2,3);
		String STREET=EUTIL.getIndividualTestDate("leads", 2,1);
		String POBOX=EUTIL.getIndividualTestDate("leads", 2,2);
		String POSTALCODE=EUTIL.getIndividualTestDate("leads", 2,3);
		String CITY=EUTIL.getIndividualTestDate("leads", 2,1);
		String COUNTRY=EUTIL.getIndividualTestDate("leads", 2,2);
		String STATE=EUTIL.getIndividualTestDate("leads", 2,3);
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLeads();
		LeadsHomePage ip= new LeadsHomePage(driver);
		ip.clickOnNewLeadsButton();
		CreateNewLeadsPage ch =new CreateNewLeadsPage(driver);
		ch.createLeads(FIRSTNAME, LASTNAME, COMPANY, STREET, POBOX, POSTALCODE, CITY, COUNTRY, STATE);
		Thread.sleep(400);
		
	}
	
}