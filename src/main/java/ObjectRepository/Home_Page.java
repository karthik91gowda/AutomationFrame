package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic_utility.Selenium_Utility;

public class Home_Page {
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

		
		@FindBy(xpath="(//a[text()='Leads'])[1]")
		private WebElement leads;
		
		
		@FindBy(xpath="(//a[text()='Organizations'])[1]")
		private WebElement org;
		
		@FindBy(xpath="(//td[@class='small'])[2]")
		private WebElement preferances;

		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement signoutoption;
		
		
		//public WebElement getLeads() {
			//return leads;
		//}
		

		
		public void setLeads(WebElement leads) {
			this.leads = leads;
		}

		public void setOrg(WebElement org) {
			this.org = org;
		}

		public void setPreferances(WebElement preferances) {
			this.preferances = preferances;
		}

		public void setSignoutoption(WebElement signoutoption) {
			this.signoutoption = signoutoption;
		}



		
		/**
		 * this is a business LIB to logout 
		 * @throws Exception
		 */
		
		
		
		public void  logoutOpretaion11(WebDriver driver) throws Exception {
			Generic_utility.Selenium_Utility st=new Selenium_Utility();
			st.moveToAnElement(driver,preferances);
			Thread.sleep(3000);
			st.moveToAnElement(driver,signoutoption);
		}
		
		
		public WebElement getOrg() {
			return org;
		}

		public WebElement getPreferances() {
			return preferances;
		}

		public WebElement getSignoutoption() {
			return signoutoption;
		}
		
		public void clickOnLeads()
		{
			leads.click();
		}
		
		public void clickOnOrg() {
			org.click();
		}
		/**
		 * this is a business LIB to logout 
		 * @throws Exception
		 */
		
		
		
		public void  logoutOpretaion(WebDriver driver) throws Exception {
			Selenium_Utility st=new Selenium_Utility();
			st.moveToAnElement(driver,preferances);
			Thread.sleep(3000);
			st.moveToAnElement(driver,signoutoption);
		}
		
		
		
	}