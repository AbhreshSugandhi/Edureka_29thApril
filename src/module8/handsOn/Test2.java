package module8.handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();

		driver.get("https://docs.seleniumhq.org/");

		SeleniumHomePageObjects page = new SeleniumHomePageObjects(driver);

		page.clickD();

	}

}
