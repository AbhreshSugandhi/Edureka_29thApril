package module8.handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomePageObjects {

	@FindBy(linkText = "Download")
	public WebElement linkDownload;

	@FindBy(linkText = "Projects")
	public WebElement linkProjects;

	@FindBy(linkText = "Browser Automation")
	public WebElement linkHome;

	public SeleniumHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickD() {
		linkDownload.click();
	}

	public void clickP() {
		linkProjects.click();
	}

	public void clickHome() {
		linkHome.click();
	}
}
