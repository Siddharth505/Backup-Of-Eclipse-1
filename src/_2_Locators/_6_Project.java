package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_Project {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://elabs.omoknow.com/#/home_page");
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("Bhanu.marketclear@gmail.com");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//button[@color='primary']")).click();
		//*[@id='maincontent']/table/tbody/tr[1]/th
	}

}
