package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	protected static WebDriver driver = null;
	
	/*public WebDriver getDriver() {
		return driver;
	}*/
	
	public static void setDriver(String drivername) throws Exception{
		drivername = drivername.trim();
		if(drivername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		}
		else if(drivername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if (drivername.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
			throw new Exception("Browser name invalid in the properties file");
		driver.manage().window().maximize();
	}
	
	public static void closeDriver() {
		driver.quit();
	}

	public static void goTo(String url) {
		driver.get(url);
	}
}
