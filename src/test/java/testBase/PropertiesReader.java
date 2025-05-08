package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesReader {

	static Properties prop = new Properties();
	static File file;
	static FileInputStream fis;
	static String browser = null;
	static String url = null;
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = getDriverProperties("chromeBrowser");
		driver.get(getUrl("FlightUrl"));
	}
	public static WebDriver getDriverProperties(String browserName){
		try {
			fis = new FileInputStream("C:\\Users\\gaurav.samantaray\\git\\HandsOnMMT\\src\\test\\resources\\config\\properties\\browserConfigurations.properties");
			prop.load(fis);
			if(browserName.contentEquals("chromeBrowser")) {
				driver = new ChromeDriver();
				return driver;
				}
			else if(browserName.contentEquals("firefoxBrowser")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				return driver;
				}
			else if(browserName.contentEquals("internetExplorerBrowser")) {
				WebDriverManager.edgedriver().setup();
				driver = new InternetExplorerDriver();
				return driver;
				}
			

			fis.close();
			} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	public static String getUrl(String requiredURL){
		try {
			fis = new FileInputStream("C:\\Users\\gaurav.samantaray\\git\\HandsOnMMT\\src\\test\\resources\\config\\properties\\urlConfigurations.properties");
			prop.load(fis);
			if(requiredURL.contentEquals("FlightUrl")) {
				url = prop.getProperty(requiredURL);
				return url;
				}
			else if(requiredURL.contentEquals("BusURL")) {
				url = prop.getProperty(requiredURL);
				return url;
				}
			else if(requiredURL.contentEquals("HomestaysURL")) {
				url = prop.getProperty(requiredURL);
				return url;
				}
			else if(requiredURL.contentEquals("HotelURL")) {
				url = prop.getProperty(requiredURL);
				return url;
				}
			else if(requiredURL.contentEquals("HolidayPackagesURL")) {
				url = prop.getProperty(requiredURL);
				return url;
				}
			

			fis.close();
			} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return requiredURL;
	}
}
