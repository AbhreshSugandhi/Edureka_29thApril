package module11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliX {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Screen s = new Screen();

		Pattern Login = new Pattern("D:\\Training\\Selenium\\Programs\\Edureka_29thApril\\Autoit&Sikuli\\Login.JPG");

		s.getScreen().click(Login);

		Pattern UName = new Pattern("D:\\Training\\Selenium\\Programs\\Edureka_29thApril\\Autoit&Sikuli\\Username.JPG");
		s.getScreen().type(UName, "Abhresh");

		// s.getScreen().type("D:\\Training\\Selenium\\Programs\\Edureka_29thApril\\Autoit&Sikuli\\Username.JPG",
		// "Abhresh");

	}
}
