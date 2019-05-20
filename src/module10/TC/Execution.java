package module10.TC;

import module10.Actions.ActionKeywords;
import module10.Utility.ExcelUtility;

public class Execution {

	public static void main(String[] args) throws Exception {

		String path = "D:\\Training\\Selenium\\Programs\\Edureka_29thApril\\src\\module10\\TestData\\MyDataEngine.xlsx";

		ExcelUtility.excelsetup(path, "Sheet1");
		
		for(int i=0; i<=3; i++) 
		{
			String Keyword = ExcelUtility.getData(i, 1);	
			if(Keyword.equals("OpenBrowser")) 
			{
				ActionKeywords.OpenBrowser();
			}
			else if (Keyword.equals("Navigate")) 
			{
				ActionKeywords.Navigate();
			}
			else if (Keyword.equals("ClickGmail"))
			{
				ActionKeywords.ClickGmail();
			}

		}
}
}