package _ANGULAR;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader
{
	
	public Workbook getTestDatFile(String path) {
		
		Workbook wb =null;
		
		try {
		                                                                            //File file = new File("C:/Users/Siddharth/Desktop/Excel.xlsx");
			FileInputStream fis = new FileInputStream(path);
			wb = WorkbookFactory.create(fis);
			return wb;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return wb;
		
	}
}
