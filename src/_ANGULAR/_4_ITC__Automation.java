 package _ANGULAR;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class _4_ITC__Automation {

	public static void main(String[] args) throws InterruptedException {
		String path = "C:/Users/Siddharth/Desktop/ITC-TEST-PACK.xlsx";


		
		
		ExcelReader excelreader = new ExcelReader();              // excel reader class ka ek refernce variable bana hai 
		
		Workbook wb = excelreader.getTestDatFile(path);           // PATH OF EXCEL FILE    [ With HELP OF REFERNCE VARIABLE, METHOD OF EXCEL CLASS IS CALLED ] 
		                                                         
		Sheet testsheet = wb.getSheet("Test-Data");               // PASSING THE SHEET NAME : Name of Sheet is : Test - Data
		
		String weburl = testsheet.getRow(0).getCell(2).getStringCellValue();         //PASSED THE URL FROM EXCEL SHEET : SPECIFIED ROW NO AND COLOUM NO
		
		Row row = testsheet.getRow(1);                                           // TESTSHEET REFERNCE VARIABLE PASSED HERE
		
		Cell cell = row.getCell(2);		                                         // ROW VARIABLE PASSED HERE
		
		int testDataStartRow =  (int)testsheet.getRow(1).getCell(2).getNumericCellValue();             // NUMERIC CELL VALUE METHOD PADNA PADEGA
		
		int testDataStartColumn = (int)testsheet.getRow(2).getCell(2).getNumericCellValue();           // test Data Start Coloum refernce variable hai jiska type hai int 
                                                                                                       // aur Store karwaya gaya hai isko 
		
		
		
		
		
		ChromeDriver driver = getWebDriver(weburl);                       // WEBURL IS THE REFERNCE VARIABLE PASSED HERE OF LINE 34. Function : ????

		int rowNumber = testDataStartRow - 1;                             // testDataStartRow Passed Here and STORED IN ROW NUMBER... Bt WHY -1 ????
		
		int column = testDataStartColumn - 1;
		
		String elementname = "";
		
		do {   // TestSheet = Name Of Sheet)
			elementname = testsheet.getRow(rowNumber).getCell(column)!=null?testsheet.getRow(rowNumber).getCell(column).getStringCellValue():null;
			
			String identifyWith = testsheet.getRow(rowNumber).getCell(column + 1)!=null?testsheet.getRow(rowNumber).getCell(column + 1).getStringCellValue():null;
			
			String idDetails = testsheet.getRow(rowNumber).getCell(column + 2)!=null?testsheet.getRow(rowNumber).getCell(column + 2).getStringCellValue():null;
			
			String action = testsheet.getRow(rowNumber).getCell(column + 3)!=null?testsheet.getRow(rowNumber).getCell(column + 3).getStringCellValue():null;
			
			String details = testsheet.getRow(rowNumber).getCell(column + 4)!=null?testsheet.getRow(rowNumber).getCell(column + 4).getStringCellValue():null;
			
			String ExpectedResult = testsheet.getRow(rowNumber).getCell(column + 5)!=null?testsheet.getRow(rowNumber).getCell(column + 5).getStringCellValue():null;
			
			String ActualResult = testsheet.getRow(rowNumber).getCell(column + 6)!=null?testsheet.getRow(rowNumber).getCell(column + 6).getStringCellValue():null;
			
			
			
			WebElement element = getElementByIdentification(driver, identifyWith, idDetails, ExpectedResult,ActualResult);
			
			
			
			if (element != null || "Wait".equalsIgnoreCase(elementname) || "implicit_wait".equalsIgnoreCase(elementname)) 
			{
				System.out.println("ELement iDentified : " + elementname);
			//	testsheet.getRow(rowNumber).getCell(column + 8).setCellValue("Identified");
				if (action != null) 
				{
					performActionOnELement(driver,element, action, details);
					Thread.sleep(2000);
					
					
				}
			
			} else {
				System.out.println("ELement COuld not be iDentified : " + elementname +" : ID-Details " + idDetails);
			}
			rowNumber++;
			

		
		} while (!"EOF".equals(elementname ))
		
			
		 
		
		 
		 
		 

	private static ChromeDriver getWebDriver(String weburl) {
		System.setProperty("webdriver.chrome.driver", "D:/SOFTWARES/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(weburl);
		return driver;
	}

	public static WebElement getElementByIdentification(ChromeDriver driver, String identifyWith, String idDetails,String ExpectedResults,String ActualResults) {
		WebElement resultant = null;
		if(identifyWith!=null) {		
		switch (identifyWith.toLowerCase()) {
		case "xpath":
			resultant = driver.findElement(By.xpath(idDetails));
			break;
		case "id":
			resultant = driver.findElement(By.id(idDetails));
			break;
		case "name":
			resultant = driver.findElement(By.name(idDetails));
			break;
		case "class":
			resultant = driver.findElement(By.className(idDetails));
			break;
		}
		}
		return resultant;

	}

	public static void performActionOnELement(ChromeDriver driver , WebElement element, String acion, String details) {

		switch (acion.toLowerCase()) {
		case "click":
			element.click();
			break;
		case "sendkeys":
			element.sendKeys(details);
			;
			break;
			
		case "clearinput":
			element.sendKeys(Keys.CONTROL,"a");
			element.sendKeys(Keys.DELETE);
			;
			break;
			
			
			
		case "wait":
			try {
				Thread.sleep(Long.parseLong(details));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;
		case "implicit_wait":
			driver.manage().timeouts().implicitlyWait(Long.parseLong(details),TimeUnit.SECONDS);
			break;
		}
	}

}
