package Issues;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	static WebDriver driver;

	public void openbrowser() {
		String strBrowser = null;
		try {

			Properties prop = new Properties();
			File file = new File(System.getProperty("user.dir") + "\\src\\Issues\\EnvProp.properties");
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
			strBrowser = prop.getProperty("Browser");
			System.out.println(strBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (strBrowser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (strBrowser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\drivers\\geckodriver_0.24.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

	}
}