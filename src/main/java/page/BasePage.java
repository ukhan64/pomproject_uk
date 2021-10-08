package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public void dropdown(WebElement element, String abc)
	{ Select sel= new Select (element);
	sel.selectByVisibleText(abc);
		
	}
	
	public int randomnumber (int boundary) {
		Random rnd= new Random();
		int randomn=rnd.nextInt(boundary);
		return randomn;
	}
	
	
}
