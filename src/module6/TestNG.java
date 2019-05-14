package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {

	WebDriver driver;

	@Test
	public void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

	@Parameters("UName")
	@Test
	public void Login(String UName, String Pass) throws InterruptedException {
		// Enter UserID
		driver.findElement(By.name("username")).sendKeys(UName);

		// Enter Password
		driver.findElement(By.name("password")).sendKeys(Pass);

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
	}

	@Test
	public void CloseBrowser() {
		driver.close();
	}
}
