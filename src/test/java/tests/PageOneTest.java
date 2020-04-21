package tests;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.PageOne;
import utils.BrowserFactory;

public class PageOneTest {
	WebDriver driver;
	public PageOne One;
	
	@Test
	public void LogIn() {
		driver = BrowserFactory.OpenBrowser();
		One = new PageOne(driver);
		One.SignIn("geoph.saidho@gmail.com","abc123");
	}
	
	@Test
	public void PracticTest() {
		
		String ExpectedTitle = "Let's Kode It";
		String ActuelTitle=driver.getTitle().toString();
		assertEquals(ActuelTitle, ExpectedTitle);
		System.out.println(ActuelTitle);
		One = new PageOne(driver);
		One.Practice();
		
	}
	

}
