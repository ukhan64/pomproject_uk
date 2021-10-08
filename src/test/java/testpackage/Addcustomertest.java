package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Addcustomerpage;
import page.Dashboardpage;
import page.Loginpage;
import util.Browserfactory;

public class Addcustomertest {
WebDriver driver;

@Test
	public void usershouldbeabletocreatecustomer () {
			driver= Browserfactory.init();
			Loginpage loginpage= PageFactory.initElements(driver, Loginpage.class);
			loginpage.enterusername("demo@techfios.com");
			loginpage.enterpassword("abc123");
			loginpage.clicksigninbutton();
			Dashboardpage dashboard=PageFactory.initElements(driver, Dashboardpage.class);
			dashboard.verify();
			dashboard.clickcustomers();
			dashboard.addcustomerbutton();
			
			Addcustomerpage addcustomer=PageFactory.initElements(driver, Addcustomerpage.class);
			addcustomer.enterfullname("Umair khan");
			addcustomer.entercompanyfield("Techfios");
			addcustomer.emailenter("ukh1009");
			Browserfactory.teardown();
	}
}
