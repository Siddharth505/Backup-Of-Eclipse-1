package _ANGULAR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ELAB {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// 1 CODE FOR LOGIN 
		
		driver.get("https://sit-lims-elabs.omoknow.com/#/home_page");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("Bhanu.marketclear@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//button[@color='primary']")).click();
		 Thread.sleep(6000);
		 
driver.findElement(By.xpath("//div[@class='col-lg-12']//img[@src='assets/img/allModulesLogo/1.png']\r\n" + 
		"")).click();
		  
		  
		  Thread.sleep(6000);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
		  // 2 CODE FOR CREATING A DEPARTMENT
		  
		  driver.findElement(By.xpath("//a[text()=' Master']\r\n" + "")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()='Departments']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='mat-form-field-infix']//input[@type='text']")).sendKeys("ab");
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[2]")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[text()=' A ']")).click();
		  
		  //Thread.sleep(3000);
		  //driver.findElement(By.xpath("//span[text()=' I ']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='col-lg-3']//button[text()='Save']")).click();
		  
		  // 3 CODE FOR CREATING A COUNTRY 
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()=' Master']\r\n" + "")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()='Countries']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='mat-form-field-infix']//input[@type='text']")).sendKeys("ab");
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='mat-select-value']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[text()=' A ']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='col-lg-3']//button[text()='Save']")).click();
		  
		  // 4 CODE FOR CREATING A STATE 
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()=' Master']\r\n" + "")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()='States']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='mat-form-field-infix']//input[@type='text']")).sendKeys("Assam1");
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//div[@class='mat-select-value'])[1]")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[text()=' India ']")).click();
		
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//div[@class='mat-select-value'])[2]")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[text()=' A ']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='col-lg-3']//button[text()='Save']")).click();

		  // CODE FOR ADDING A BRANCH 
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()=' Master']\r\n" + "")).click();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Branches']")).click();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='mat-form-field-infix']//input[@id='mat-input-5']")).sendKeys("Branch");
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Country']")).click();
		  
		  
		  
	}

}
