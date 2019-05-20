package module10.Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	static Workbook wb;
	static Sheet sh;
	
	public static void excelsetup(String path, String ShName) throws Exception {
		
		FileInputStream fis = new FileInputStream(path);
		
		wb = WorkbookFactory.create(fis);

		sh = wb.getSheet(ShName);
		//sh = wb.getSheetAt(ShNum);
	}
	public static String getData(int rownum, int cellnum) {
		
		String data = sh.getRow(rownum).getCell(cellnum).toString();
		
		return data;
	}
}
