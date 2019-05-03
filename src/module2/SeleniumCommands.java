package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumCommands {

	public static void main(String[] args) {

		// Single Line Comment
		/*
		 * This is A multi line comment
		 */

		// Invoike / Innitialization / open Browser

		// Open Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		// Open FirefoxBrowser
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\drivers\\geckodriver_0.24.exe");
		WebDriver driver1 = new FirefoxDriver();

		// Open IE Browser
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Selenium\\drivers\\IEDriverServer_3.10.exe");
		WebDriver driver2 = new InternetExplorerDriver();

		// Safari Browser
		WebDriver driver3 = new SafariDriver();

		// Close and Quit
		driver.close();// this will close the current active window of the current instance
		driver.quit();// this will close all the windows in the current instance

		// Get commands
		driver.get("URL");// to get the URL of the AUT
		driver.getTitle();// to capture the current page title
		driver.getCurrentUrl();// to capture current URL of that page
		//driver.getWindowHandle();// to capture the name of the window
		
		// Navigation commands
		driver.navigate().to("URL");// to move from A to B
		driver.navigate().back();// to move to the previous page
		driver.navigate().forward();// to move to the next page
		driver.navigate().refresh();// to refresh the page

		// Element handling
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).clear();
		//driver.findElement(By.id("")).submit();

	}
}
