package TestCase_Repostiry;

import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.Java_Utility;
import ObjectRepository.CreateNewLeadsPage;
import ObjectRepository.Home_Page;
import ObjectRepository.LeadsHomePage;

public class LE_02 extends BaseClass {
	@Test
	public void le_02Case() throws Exception{
		Java_Utility JTUIL =new Java_Utility();
		int num =JTUIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		String FIRSTNAME=EUTIL.getIndividualTestDate("Leads", 5,1);
		String LASTNAME=EUTIL.getIndividualTestDate("Leads", 5,2);
		String COMPANY=EUTIL.getIndividualTestDate("Leads", 5,3);
		String TITLE=EUTIL.getIndividualTestDate("Leads", 5,4);
		String PHONE=EUTIL.getIndividualTestDate("Leads", 5,5);
		String MOBILE=EUTIL.getIndividualTestDate("Leads", 5,6);
		String EMAIL=EUTIL.getIndividualTestDate("Leads", 5,7);
		String NOE=EUTIL.getIndividualTestDate("Leads", 5,8);
		String STREET=EUTIL.getIndividualTestDate("Leads", 5,9);
		String POBOX=EUTIL.getIndividualTestDate("Leads", 5,10);
		String POSTALCODE=EUTIL.getIndividualTestDate("Leads", 5,11);
		String CITY=EUTIL.getIndividualTestDate("Leads", 5,12);
		String COUNTRY=EUTIL.getIndividualTestDate("Leads", 5,13);
		String STATE=EUTIL.getIndividualTestDate("Leads", 5,4);
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLeads();
		LeadsHomePage ip= new LeadsHomePage(driver);
		ip.clickOnNewLeadsButton();
		CreateNewLeadsPage ch =new CreateNewLeadsPage(driver);
		ch.createLeads(FIRSTNAME+num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOE, STREET, POBOX, POSTALCODE, CITY, COUNTRY, STATE);
		Thread.sleep(3000);
		
		
		
	}
}