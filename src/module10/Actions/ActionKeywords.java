package module10.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;

	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();
		System.out.println("Browser Initialized Succesfully");
	}

	public static void Navigate() {
		
		driver.get("https://www.google.com/");
		System.out.println("AUT Opened Succesfully");
	}

	public static void ClickGmail() throws Exception {
		
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Clicked on GMail Link Succesfully");
		Thread.sleep(5000);
	}
	
}
