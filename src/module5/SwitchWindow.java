package module5;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Part 1
		// Get the main window name
		String mw = driver.getWindowHandle();
		System.out.println("Main window name is:- " + mw);
		System.out.println("===============================================================");
		Thread.sleep(5000);

		// Part 2
		// Click on the button to open a new window
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

		// Get the names of all the windows opened
		Set<String> allwn = driver.getWindowHandles();
		System.out.println("All window names are:- " + allwn);
		System.out.println("===============================================================");
		Thread.sleep(5000);

		// Part 3 
		//Get all the window names and run them in the for loop

		for (String sw : driver.getWindowHandles()) {
			Thread.sleep(5000);

			driver.switchTo().window(sw);
			// B is my active window and I will switch from B to A window with this command

			Thread.sleep(5000);

			driver.switchTo().window(sw);
			// A is active window so it will switch from A to B window
			
		}

		driver.quit();
	}

}
