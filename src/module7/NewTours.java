package module7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTours {

	public RemoteWebDriver driver;
	
	@Parameters("System")
	@BeforeTest
	public void openBrowser(String device) throws MalformedURLException {
		if (device.equalsIgnoreCase("pc1")) {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL("http://192.168.137.1:5555/wd/hub"), cap);

		} else if (device.equalsIgnoreCase("pc2")) {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL("http://192.168.137.1:5555/wd/hub"), cap);
		} 
	}
	
	@Test
	public void TestLogin() throws InterruptedException {
	
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		driver.findElement(By.name("password")).sendKeys("tutorial");

		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
	
		driver.quit();
		
	}	
}
