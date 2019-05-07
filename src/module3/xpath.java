package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open the AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//LastName TextBox
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Sugandhi");
		Thread.sleep(5000);
		
		//Using 
		driver.findElement(By.xpath("//*[@name='lastname']//preceding::input[1]")).sendKeys("Abhresh");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='lastname']//following::input[9]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[contains(@name,'profession')]//following::input[5]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[starts-with(text(),'Test')]")).click();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
