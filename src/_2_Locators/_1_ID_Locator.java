package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_ID_Locator {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("SIDD");
			
			
			
	}

}
