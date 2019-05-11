package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");
		
		//Creating a WebElement so that it can be used in the switch command to switch to it
		WebElement box = driver.findElement(By.tagName("iframe"));
		
		//This command will switch the focus of the webdriver to that element
		driver.switchTo().frame(box);
	
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, target).perform();
		
	}

}
