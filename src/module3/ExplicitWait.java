package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

		//driver.findElement(By.linkText("LinkText-5"));
		WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))).click();
		
		/*
		 * WebElement link5 =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))
		 * ); link5.click();
		 */		
		
		/*
		 * WebElement link5 = driver.findElement(By.linkText("LinkText-5"));
		 * wait.until(ExpectedConditions.elementToBeClickable(link5)).click();
		 */		
	}
}
