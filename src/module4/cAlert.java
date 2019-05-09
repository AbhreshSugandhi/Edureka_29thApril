package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cAlert {

	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		//Get AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//Click on the button to Open the ALert
		driver.findElement(By.id("confirm")).click();

		Alert cA = driver.switchTo().alert();
		
		System.out.println(cA.getText());
		
		cA.dismiss();
	
		
		
	}

}
