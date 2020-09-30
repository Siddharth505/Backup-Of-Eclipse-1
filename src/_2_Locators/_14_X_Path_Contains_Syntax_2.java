package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14_X_Path_Contains_Syntax_2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUMData/SELENIUMClasses/Classes/april23/XpathByContains.html");
		
		driver.findElement(By.xpath("//input [contains (@type, 'text')]")).sendKeys("PASS");
 
		driver.findElement(By.xpath("//button[contains ( text() , 'Sign')]")).sendKeys("PASS");
		

	}

}
