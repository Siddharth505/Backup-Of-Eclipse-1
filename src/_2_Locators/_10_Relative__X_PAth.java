package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_Relative__X_PAth {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUMData/SELENIUMClasses/Classes/april22/CSSSelector.html");
		
		driver.findElement(By.xpath("//input[1]")).sendKeys("AB");
		driver.findElement(By.xpath("//input[2]")).sendKeys("JHKJ");	}

}
