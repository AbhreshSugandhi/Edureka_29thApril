package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		String AppTitle = driver.getTitle();

		System.out.println(AppTitle);
			
		boolean result = AppTitle.equals("Google");// Google = google? false
		
		System.out.println(result);
		
	}

}
