
package module8.handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects2 {

	@FindBy(id = "sb_form_q")
	public WebElement txtSearch;

	@FindBy(name = "go")
	public WebElement btnSearch;

	@FindBy(linkText = "Selenium - Web Browser Automation")
	public WebElement linkSelenium;

	public BingHomePageObjects2(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void SearchBing(String SearchText) {
		txtSearch.clear();
		txtSearch.sendKeys(SearchText);
		btnSearch.click();
	}

	public void LinkClick() {

		linkSelenium.click();
	}

}
