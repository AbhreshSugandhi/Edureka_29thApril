package module12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


public class NewTest2 {

	WebDriver driver;

	@AfterMethod
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
	}
	
	@BeforeSuite
	public void OpenBrowser() {
		System.setProperty("phantomjs.binary.path", "D:\\Training\\Selenium\\Selenium\\drivers\\phantomjs.exe");
		driver = new PhantomJSDriver();
	}


	@Test
	public void TestLogin() throws InterruptedException {
		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@AfterSuite
	public void CloseBrowser() {
		driver.quit();
	}

	@BeforeTest
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

}
