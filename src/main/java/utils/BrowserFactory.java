package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Said\\eclipse-workspace2\\TestJenkins\\Data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
