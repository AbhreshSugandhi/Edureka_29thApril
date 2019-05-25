package module11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		driver.findElement(By.name("photo")).click();
		
		//Thread.sleep(5000);
		
		Runtime.getRuntime().exec("D:\\Training\\Selenium\\Programs\\Edureka_29thApril\\Autoit&Sikuli\\Edureka_29thApril.exe");

		Thread.sleep(7000);
		
		//driver.quit();
		
	}

}
