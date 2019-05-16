package module8.handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingTextSearch {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();

		driver.get("https://www.bing.com/");

		BingHomePageObjects page = new BingHomePageObjects(driver);
		
		page.txtSearch.clear();
		page.txtSearch.sendKeys("SeleniumHQ");
		page.btnSearch.click();

		page.txtSearch.clear();	
		page.txtSearch.sendKeys("Selenium");
		page.btnSearch.click();

		page.txtSearch.clear();
		page.txtSearch.sendKeys("Edureka");
		page.btnSearch.click();

		page.txtSearch.clear();
		page.txtSearch.sendKeys("Abhresh");
		page.btnSearch.click();

		page.txtSearch.clear();
		page.txtSearch.sendKeys("Abhresh Sugandhi");
		page.btnSearch.click();

	}

}
