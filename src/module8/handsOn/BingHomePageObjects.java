package module8.handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects {

	
	@FindBy(id="sb_form_q")
	public WebElement txtSearch;
	
	@FindBy(name="go")
	public WebElement btnSearch;
	
	
	public BingHomePageObjects(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
}
