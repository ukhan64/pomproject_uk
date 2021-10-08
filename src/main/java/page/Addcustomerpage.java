package page;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Addcustomerpage extends BasePage {
	WebDriver driver;
	public Addcustomerpage (WebDriver driver) {
		this.driver= driver;
	}
		
		@FindBy(how= How.XPATH, using= "//input[@id='account']") WebElement FULLNAME_FIELD;
		@FindBy(how= How.XPATH, using= "//select[@id='cid']") WebElement COMPANY_FIELD;
		@FindBy(how= How.XPATH, using= "//input[@id='email']") WebElement EMAIL_FIELD;
		
		public void enterfullname (String fullname) {
			
			FULLNAME_FIELD.sendKeys(fullname+ randomnumber(999));
		}
// method for random number
				
		
		public void entercompanyfield (String company) {
			dropdown(COMPANY_FIELD, "BITS");
		}
		
		public void emailenter (String email) {
			EMAIL_FIELD.sendKeys(randomnumber(999)+ email);
}
}