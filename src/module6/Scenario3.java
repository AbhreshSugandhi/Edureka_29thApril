package module6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Scenario3 {

	private WebDriver driver;
	String URL = "http://www.gmail.com";

	@Parameters("B")
	@BeforeTest
	public void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Program Files\\Selenium\\drivers\\geckodriver_0.24.exe");
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Program Files\\Selenium\\drivers\\IEDriverServer_3.10.exe");
				driver = new InternetExplorerDriver();
			}

		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void login_TestCase() {
		driver.navigate().to(URL);
		// do something
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}