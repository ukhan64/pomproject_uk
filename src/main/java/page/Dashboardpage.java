package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Dashboardpage {

	WebDriver driver;
	
	//ESTABLISHING THE RELATIONSHIP BETWEEN DRIVER
		
		public Dashboardpage (WebDriver driver) {
			this.driver= driver;
			}
		
		@FindBy(how= How.XPATH, using= "//h2[contains(text(),'Dashboard')]") WebElement DASHBOARD_HEADER_FIELD;
		@FindBy(how= How.XPATH, using= "//body/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]/i[1]") WebElement CUSTOMERS_FIELD;
		@FindBy(how= How.XPATH, using= "//a[contains(text(),'Add Customer')]") WebElement ADD_CUSTOMER_FIELD;
		
		public void verify () {
			Assert.assertEquals(DASHBOARD_HEADER_FIELD.getText(), "Dashboard", "Problem");
		}
		
		public void clickcustomers () {
		CUSTOMERS_FIELD.click();
		}
		
		public void addcustomerbutton () {
			ADD_CUSTOMER_FIELD.click();
			}
}
