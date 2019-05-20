package Issues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operators {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");	
	WebDriver driver = new ChromeDriver();
	
	//Open site
	driver.get("http://newtours.demoaut.com/");
	
	//Finding text UserName with partial text and x-path
	String text = driver.findElement(By.xpath("//*[contains(text(),'User')]")).getText();
	/*
	 * Look at the commands and its description and then use them accordingly
	 * get command is used with String not WebElement 
	 */
	System.out.println(text);

	
	//Passing User Name Value
	driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("abc");
	
	//Passing password value
	driver.findElement(By.xpath("//*[@type='password' and @name='password']")).sendKeys("er");
	
	//Clicking on Sign-in button
	driver.findElement(By.xpath("//*[@type='image' or @name='login']")).click();
}
}