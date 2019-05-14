package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisableEnable {

	WebDriver driver;

	@Test(priority = 0)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(priority = 2)
	public void Login() throws InterruptedException {

		driver.findElement(By.linkText("SIGN-ON")).click();

		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void CloseBrowser() {
		driver.close();
	}

	@Test(priority = 4, enabled = true)
	public void TestRegisterLink() {
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@Test(priority = 5, enabled = true)
	public void TestSupportLink() {
		driver.findElement(By.linkText("SUPPORT")).click();
	}

}
