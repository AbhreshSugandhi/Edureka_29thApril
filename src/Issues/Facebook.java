package Issues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		// Open Bowser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get("https://www.facebook.com/");

		/*
		 * Passing values in firstname,lastname and mobile number field in home page
		 * using id driver.findElement(By.id("u_0_c")).sendKeys("Priya");
		 * driver.findElement(By.id("u_0_e")).sendKeys("Patel");
		 * driver.findElement(By.id("u_0_h")).sendKeys("7327072320");
		 * 
		 * //Passing values in firstname using Name
		 * driver.findElement(By.name("firstname"));
		 * 
		 * //Using Class Name
		 * driver.findElement(By.className("inputtext")).sendKeys("Priya");
		 * driver.findElement(By.className("inputtext")).sendKeys("Patel");
		 * 
		 * //Click on Forgot account in home page with the help of linktext
		 * driver.findElement(By.linkText("Forgot account?")).click();
		 * 
		 * //To navigate back to home page driver.navigate().back();
		 * 
		 * 
		 * //Click on 'do I' in home page with the help of Partial Link Text
		 * driver.findElement(By.partialLinkText("do I")).click();
		 */

		// Trying to find the text Connect with in home page of facebook and trying to
		// print in console
		String te = driver.findElement(By.xpath("//*[contains(text(),'Connect with')")).getText();
		/*
		 * //I dont see any content having the words "Connect with" as it is. 
		 * Why dont you try working with normal ways first and then do R&D, also the missing
		 * brackets in the script is also going to impact you wrote the xpath as -
		 * "//*[contains(text(),'Connect with')" correct one is -
		 * "//*[contains(text(),'Connect with')]" the bracket closer was missing apart
		 * from that even the contents functions used was incorrect i didnt explained
		 * you can use any randum words out of the complete text I said any word or any
		 * part of it but in continuations - "connect and share with" and u used it as
		 * "connect with"
		 */
		System.out.println(te);

		// Passing values for month,date and year in home page of facebook

		driver.findElement(By.xpath("//*[@id='month' and @name='birthday_month']//following::select/option[3]")).click();// Only this is correct
		driver.findElement(By.xpath("//*[@id='day' and @name='birthday_day']//following::select/option[3]")).click(); 
		// not a unique Xpath
		driver.findElement(By.xpath("//*[@id='year']//following::select[1]/option[30]")).click(); // incorrect Xpath
	}
}