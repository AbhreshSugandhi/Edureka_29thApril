package module9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

	@FindBy(id = "ts_first_name")
	public WebElement FName;

	@FindBy(id = "ts_last_name")
	public WebElement LName;

	@FindBy(id = "ts_address")
	public WebElement Address;

	public FormPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void FormFill(String fName, String lName, String add) throws Exception {

		FName.clear();
		FName.sendKeys(fName);

		LName.clear();
		LName.sendKeys(lName);

		Address.clear();
		Address.sendKeys(add);

		Thread.sleep(5000);
	}

}
