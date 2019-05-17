package module9.TestCase;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module9.Pages.FormPage;

public class DDT {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int norow;
	int nocols;

	@BeforeTest
	public void Setup() {

		// Open Browser - Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();

		// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

	}

	@Test(dataProvider = "testDataFeeder")
	public void FormFill(String fName, String lName, String add) throws Exception {

		FormPage fp = new FormPage(driver);
		fp.FormFill(fName, lName, add);
	}

	@DataProvider
	public Object[][] testDataFeeder() throws Exception {

		/*
		 * Apache POI using ss.usermodel which is used to work with both variants of
		 * excel file (.xls) and (.xlsx)
		 */

		// to import the file to the script and fetch the bites from the file
		FileInputStream fis = new FileInputStream(
				"D:\\Training\\Selenium\\Programs\\Edureka_29thApril\\src\\module9\\TestData\\TestData.xlsx");

		// to open the Workbook
		wb = WorkbookFactory.create(fis);

		// to open the sheet in the above workbook
		sh = wb.getSheet("Sheet2");

		// total no of rows and columns
		norow = sh.getLastRowNum();

		nocols = sh.getRow(0).getLastCellNum();

		Object[][] formData = new Object[norow][nocols];

		for (int row = 0; row < norow; row++) {
			for (int col = 0; col < nocols; col++) {
				// to fetch the data from the cell which will be selected based on the values of
				// rows and columns
				formData[row][col] = sh.getRow(row).getCell(col).toString();
			}
		}
		return formData;

	}

	@AfterTest
	public void QuitBrowser() {
		driver.quit();
	}

}
