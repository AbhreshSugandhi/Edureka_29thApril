package module8.handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingTextSearch2 {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();

		driver.get("https://www.bing.com/");

		BingHomePageObjects2 page = new BingHomePageObjects2(driver);

		page.SearchBing("SeleniumHQ");
		
		page.LinkClick();
		
		SeleniumHomePageObjects page1 = new SeleniumHomePageObjects(driver);
		
		page1.clickD();
		
		page1.clickP();
		
		page1.clickHome();
		
	}

}
