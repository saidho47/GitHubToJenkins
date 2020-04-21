package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageOne extends BasePage {

	WebDriver driver;
	
	public PageOne(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(css="input#user_email")
	WebElement username;
	
	@FindBy(css="input#user_password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary btn-md login-button']")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/div/ul/li[3]/a")
	WebElement practic;
	
	@FindBy(css="input#hondaradio")
	WebElement Radio;
	
	@FindBy(css="input#benzcheck")
	WebElement Check1;
	
	@FindBy(css="input#bmwcheck")
	WebElement Check2;
	
	public WebDriver SignIn(String UserName, String PassWord ) {
		
		login.click();
		username.sendKeys(UserName);
		password.sendKeys(PassWord);
		submit.click();
		
		return driver;
	}
	
	public WebDriver Practice() {
		
		practic.click();
		Radio.click();
		Check1.click();
		Check2.click();
		
		return driver;
	}
}
