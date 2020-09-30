package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15_X_Path_Traversing {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUMData/SELENIUMClasses/Classes/april23/XpathTraversing.html");
		
		// HTML to D 
		driver.findElement(By.xpath("/html//div[2]//input[2]")).click();
		
		// BODY to E 
		driver.findElement(By.xpath("//body//div[3]/input")).click();
		
		// CASES OF BACKWARD TRAVERSING 
		 
		// CASE 1 =  F TO BODY 
		// CASE 2 = F TO A 
		
		driver.findElement(By.xpath(" //div[3]//input[2]/../.."));
		driver.findElement(By.xpath("//div[3]//input[2]/../..//div[1]//input[1]")).click();
		
		

	}

}
