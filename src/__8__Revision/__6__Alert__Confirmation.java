package __8__Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class __6__Alert__Confirmation {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Arjun");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		
		Alert alt =  driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.dismiss();
		
	
	}
}
