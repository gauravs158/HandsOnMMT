package shortFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import testBase.PropertiesReader;

public class ChangeTab {

	static Properties prop = new Properties();
	static File file;
	static FileInputStream fis;
	static String browser = null;
	static String url = null;
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = PropertiesReader.getDriverProperties("chromeBrowser");
		driver.get(PropertiesReader.getUrl("FlightUrl"));
		tabNavigation();
		driver.quit();
	}
	
	public static void tabNavigation() {
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of open tabs= "+tabs.size());
		Iterator<String> it = tabs.iterator();
		while(it.hasNext()) {
			it.next();
			System.out.println(driver.getCurrentUrl());
			String sourcePage = it.next();
			String destinationPage = it.next();
			driver.switchTo().window(destinationPage);
			driver.close();
			driver.switchTo().window(sourcePage);
		}
	}

}
