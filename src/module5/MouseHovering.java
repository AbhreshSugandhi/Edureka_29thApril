package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Enter data in the search box
		driver.findElement(By.xpath("//*[@class='desktop-searchBar']")).sendKeys("Jackets");
		
		//once data into the search box is entered we will click on the search button to search
		driver.findElement(By.xpath("//*[@class='desktop-submit']")).click();
		
		Actions act = new Actions(driver);
		
		//to hover the mouse on an element 
		/*
		 * WebElement mh = driver.findElement(By.xpath(
		 * "//*[@class='desktop-searchBar']//following::img[4]"));
		 * 
		 * act.moveToElement(mh).perform();
		 */
		
		
		WebElement mh1 = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/a"));
		
		act.moveToElement(mh1).perform();

		
		
	}

}
