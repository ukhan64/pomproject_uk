package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;
	
//ESTABLISHING THE RELATIONSHIP BETWEEN DRIVER
	
	public Loginpage (WebDriver driver) {
		this.driver= driver;
		}
	
//Element library
// Identify Elements
	
//	By username= By.xpath("//input[@id='username']");
	
	@FindBy(how= How.XPATH, using= "//input[@id='username']") WebElement USERNAME_FIELD;
	@FindBy(how=How.XPATH, using= "//input[@id='password']") WebElement PASSWORD_FIELD;
	@FindBy(how= How.XPATH, using= "//button[contains(text(),'Sign in')]") WebElement SIGNIN_FIELD;
	
// Now define the interactive methods like clicking on or sending keys bla bla
	
	public void enterusername (String username) {
		USERNAME_FIELD.sendKeys(username);
	}
	
	public void enterpassword (String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	
	public void clicksigninbutton () {
		SIGNIN_FIELD.click();}
	
// Technique combined method
	
//	public void testlogin( String username, String password) {
//		USERNAME_FIELD.sendKeys(username);
//		PASSWORD_FIELD.sendKeys(password);
//		SIGNIN_FIELD.click();
//	}
	}
	
	
	

