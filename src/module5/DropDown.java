package module5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//Initialize the Select Class and navigate to the dropdown element
		Select oSelect = new Select(driver.findElement(By.name("continents")));
		
		//Select Africa using VisibleText option
		oSelect.selectByVisibleText("Africa");
		Thread.sleep(5000);
		
		//Select South America using Index option
		oSelect.selectByIndex(4);
		Thread.sleep(5000);		
		
		//Select Antarctica using Value option
		oSelect.selectByValue("g");
		Thread.sleep(5000);
		
	}

}
