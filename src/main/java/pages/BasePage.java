package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static void WaitForWebElement (WebElement element, WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfAllElements(element));

	}

}
