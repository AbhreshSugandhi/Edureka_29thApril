package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
	
	// Single Line Comment
	/*This is
	 * A 
	 * multi
	 * line 
	 * comment
	 */
		
	// Invoike / Innitialization / open Browser
	
	//Open Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
	WebDriver driver = new ChromeDriver();
	
	//Open FirefoxBrowser
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\drivers\\geckodriver_0.24.exe");
	WebDriver driver1 = new FirefoxDriver();
	
	//Open IE Browser
	System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Selenium\\drivers\\IEDriverServer_3.10.exe");
	WebDriver driver2 = new InternetExplorerDriver();
	
	}
}
