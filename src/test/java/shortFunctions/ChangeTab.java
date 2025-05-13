package shortFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ChangeTab {

	Properties prop = new Properties();
	File file;
	FileInputStream fis;
	String browser = null;
	String url = null;
	WebDriver driver;
	Set<String> tabs;
	Iterator<String> it;
	String sourcePage;
	String destinationPage;
//	public static void main(String[] args) {
//		driver = PropertiesReader.getDriverProperties("chromeBrowser");
//		driver.get(PropertiesReader.getUrl("FlightUrl"));
//		tabNavigation();
//		driver.quit();
//	}
	
	public void goToPreferredTab() {
		tabs = driver.getWindowHandles();
		System.out.println("Number of open tabs= "+tabs.size());
		it = tabs.iterator();
		while(it.hasNext()) {
			it.next();
			System.out.println(driver.getCurrentUrl());
			sourcePage = it.next();
			destinationPage = it.next();
			driver.switchTo().window(destinationPage);
			driver.close();
		}
	}
	
	public void returnToMainWindow() {
		driver.switchTo().window(sourcePage);
	}

}
