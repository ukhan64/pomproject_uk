package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Dashboardpage;
import page.Loginpage;
import util.Browserfactory;

public class Logintest {

WebDriver driver;

@Test
	public void validusershouldbeabletologin () {
	

		driver=Browserfactory.init();       // return type of init() method is WebDriver
		
//		enterusername("demo@techfios.com");
//		enterpassword("abc123");
//	clicksigninbutton();
		
// FOR CALLING THE METHODS FROM PAGE.JAVA, we need to create object
		
//		Loginpage loginpage2 = new Loginpage();
// but for this process, we will create OBJECT with a different way which is called PAGE FACTORY
		Loginpage loginpage= PageFactory.initElements(driver, Loginpage.class);
		loginpage.enterusername("demo@techfios.com");
		loginpage.enterpassword("abc123");
		loginpage.clicksigninbutton();
		
		Dashboardpage dashboard=PageFactory.initElements(driver, Dashboardpage.class);
		dashboard.verify();
		dashboard.clickcustomers();
		dashboard.addcustomerbutton();
	}
}
