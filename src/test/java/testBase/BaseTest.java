package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	WebDriver driver;
	
	public WebDriver getInitializedDriver() {
		driver = new ChromeDriver();
		return driver;
	}
}
