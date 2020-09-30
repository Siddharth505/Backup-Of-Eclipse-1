package _ANGULAR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class __1__Login__Elabs {

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
		  
		  driver.findElement(By.xpath("//a[text()=' Master']\r\n" + "")).click();
		  
		  // CODE FOR ADDING A BRANCH
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()=' Sales']\r\n" + 
		  		"")).click();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Job Schedule']\r\n" + 
		  		"")).click();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[text()='Add More Jobs']\r\n" + 
		  		"")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//input[@type='text'])[1]\r\n" + 
		  		"")).sendKeys("sdjhsjs");
	      
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[8]\r\n" + 
		  		"")).sendKeys("Check");;
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//div[@class='mat-select-value'])[1]")).click();

	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[text()=' Haryana ']")).click();
	
	}

}
