package _ANGULAR;

import java.util.concurrent.TimeUnit;

//Can u fix ? 
		//Sir Kisi ki Help Leni Padegi Baki Mai Ek Bar Dusra Program Run Krke Try Krta hu, ager wo chal rhae hai to fir isme bhi ho sakti hai

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

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import java.util.*;

public class AutomationSuite {
	static Map<String,Map<String,String>> id_map=new HashMap<>();
	public static void main(String[] args) throws InterruptedException {
		runmyTest();		                                                         
	}
	public static void runmyTest() throws InterruptedException {
		String path = "C:/Users/Siddharth/Desktop/ITC-TEST-PACK.xlsx";
		String method_sheet = "Method";
		String id_sheet_name = "ID Key";
		int run_flag_column =11;
		int field_key_prefix =1;
		int method_column =7;
		int data_sheet_column =8;
		int field_row_in_data_sheet=0;
		int[] url_cell = {0,3};		
		
		ExcelReader excelreader = new ExcelReader();   // excel reader class ka ek refernce variable bana hai 
		Workbook wb = excelreader.getTestDatFile(path);           // PATH OF EXCEL FILE    [ With HELP OF REFERNCE VARIABLE, METHOD OF EXCEL CLASS IS CALLED ] 
    	Sheet methods = wb.getSheet(method_sheet);               // PASSING THE SHEET NAME : Name of Sheet is : Test - Data
    	Sheet id_sheet = wb.getSheet(id_sheet_name); 
    	Sheet loginSheet =  wb.getSheet("Login"); 
    	getIdmap(id_sheet);
    	
    	String weburl = methods.getRow(url_cell[0]).getCell(url_cell[1]).getStringCellValue();
    	//PASSED THE URL FROM EXCEL SHEET : SPECIFIED ROW NO AND COLOUM NO
    	ChromeDriver driver = getWebDriver(weburl); 
    	loginAndMoveToTab(driver,loginSheet);
    	for(int i=1;i<=500;i++) {
			Row activeRow =  methods.getRow(i);		
			String is_to_run =activeRow.getCell(run_flag_column).getStringCellValue();
			String key_prefix = "NOT_DEFINED";
			try {
				key_prefix = activeRow.getCell(field_key_prefix).getRichStringCellValue().getString();
			}catch(Exception e) {
				
			}
			if(is_to_run.equalsIgnoreCase("Yes")) {				
				Sheet testsheet = wb.getSheet(activeRow.getCell(data_sheet_column).getStringCellValue());  
				int last_data_row=testsheet.getLastRowNum();
				Row field_row=testsheet.getRow(field_row_in_data_sheet);
				for(int data_row=1;data_row<=last_data_row;data_row++) {
					Row active_data_row=testsheet.getRow(data_row);
					int last_data_column= active_data_row.getLastCellNum();
					for(int data_column=2;data_column<=last_data_column;data_column++) {
						String field_key = key_prefix + "_" + field_row.getCell(data_column).getStringCellValue();
						Map<String,String> elementDetails = id_map.get(field_key);
						if(elementDetails!=null) {						
							String elementname =elementDetails.get("field");
							String identifyWith = elementDetails.get("identification_type");
							String idDetails = elementDetails.get("identification");							
							String details =active_data_row.getCell(data_column).getStringCellValue();							
							WebElement element = getElementByIdentification(driver, identifyWith, idDetails);
							String action = getActionbasedUponElementType(element,elementDetails.get("field_type"),idDetails,details);							
							if (element != null || "Wait".equalsIgnoreCase(elementname) || "implicit_wait".equalsIgnoreCase(elementname)) {
								System.out.println("ELement iDentified : " + elementname + " with action " + action + "Details " + details);
							//	testsheet.getRow(rowNumber).getCell(column + 8).setCellValue("Identified");
								if (action != null) {
									performActionOnELement(driver,element, action, details);
									Thread.sleep(2000);	
								}							
							} else {
								System.out.println("ELement COuld not be iDentified : " + elementname +" : ID-Details " + idDetails);
								System.out.println("ELement COuld not be iDentified : " + elementname + " with action " + action + "Details " + details);
							}							
						}
					}					
				}
			}		
		}


	}
			
			
	
	private static ChromeDriver getWebDriver(String weburl) {
		System.setProperty("webdriver.chrome.driver", "D:/SOFTWARES/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(weburl);
		return driver;
	}

	public static WebElement getElementByIdentification(ChromeDriver driver, String identifyWith, String idDetails) {
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

	public static void getIdmap(Sheet id_sheet) {
		int lastRow = id_sheet.getLastRowNum();
		int key_col=1;
		int field_col=7;
		int field_type_col=8;
		int identification_type_col=9;
		int identification_col=10;
		
		for(int i=5;i<=lastRow;i++) {			
			Row activeRow = id_sheet.getRow(i);
			String key = "NOT_DEFINED";
			try {
			key = activeRow.getCell(key_col).getRichStringCellValue().getString();
			}catch(Exception e) {
				
			}
			System.out.println("REad Key : " + key);
			Map<String,String> keydetails = new HashMap<>();
			String field = activeRow.getCell(field_col)!=null?activeRow.getCell(field_col).getStringCellValue():"Field_not_defined";
			String field_type = activeRow.getCell(field_type_col)!=null?activeRow.getCell(field_type_col).getStringCellValue():" ";
			String identification_type =activeRow.getCell(identification_type_col)!=null?activeRow.getCell(identification_type_col).getStringCellValue():" ";
			String identification = activeRow.getCell(identification_col)!=null?activeRow.getCell(identification_col).getStringCellValue():" ";
			keydetails.put("field", field);
			keydetails.put("field_type", field_type);
			keydetails.put("identification_type", identification_type);
			keydetails.put("identification", identification);
			id_map.put(key,keydetails);
		}
	}
	public static String getActionbasedUponElementType(WebElement element, String elementType, String iddetails, String datavalue) {
		switch(elementType.toLowerCase()) {
			case "link": return "click";
			case "button": return "click";
			case "treeview": return "click";
			case "dropdown": 
				element.click();
				return "click";
			case "checkbox": return "click";
			case "text": return "sendkeys";
			case "number": return "sendkeys";
		
		}
		return null;
	}
	public static void loginAndMoveToTab(ChromeDriver driver,Sheet loginsheet) throws InterruptedException {
		int testDataStartRow =  (int)loginsheet.getRow(1).getCell(2).getNumericCellValue();             // NUMERIC CELL VALUE METHOD PADNA PADEGA
		int testDataStartColumn = (int)loginsheet.getRow(2).getCell(2).getNumericCellValue();           // test Data Start Coloum refernce variable hai jiska type hai int 
                                                                                                       // aur Store karwaya gaya hai isko 
		int rowNumber = testDataStartRow - 1;                             // testDataStartRow Passed Here and STORED IN ROW NUMBER... Bt WHY -1 ????
		
		int column = testDataStartColumn - 1;
		
		String elementname = "";
		
		do {   // TestSheet = Name Of Sheet)
			elementname = loginsheet.getRow(rowNumber).getCell(column)!=null?loginsheet.getRow(rowNumber).getCell(column).getStringCellValue():null;
			
			String identifyWith = loginsheet.getRow(rowNumber).getCell(column + 1)!=null?loginsheet.getRow(rowNumber).getCell(column + 1).getStringCellValue():null;
			
			String idDetails = loginsheet.getRow(rowNumber).getCell(column + 2)!=null?loginsheet.getRow(rowNumber).getCell(column + 2).getStringCellValue():null;
			
			String action = loginsheet.getRow(rowNumber).getCell(column + 3)!=null?loginsheet.getRow(rowNumber).getCell(column + 3).getStringCellValue():null;
			
			String details = loginsheet.getRow(rowNumber).getCell(column + 4)!=null?loginsheet.getRow(rowNumber).getCell(column + 4).getStringCellValue():null;
			
			String ExpectedResult = loginsheet.getRow(rowNumber).getCell(column + 5)!=null?loginsheet.getRow(rowNumber).getCell(column + 5).getStringCellValue():null;
			
			String ActualResult = loginsheet.getRow(rowNumber).getCell(column + 6)!=null?loginsheet.getRow(rowNumber).getCell(column + 6).getStringCellValue():null;
			
			
			
			WebElement element = getElementByIdentification(driver, identifyWith, idDetails);
			
			
			
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
			

		
		} while (!"EOF".equals(elementname ));
	
	}
	}

