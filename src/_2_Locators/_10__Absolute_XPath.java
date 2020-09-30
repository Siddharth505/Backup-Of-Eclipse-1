package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10__Absolute_XPath {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUMData/SELENIUMClasses/Classes/april22/CSSSelector.html");
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("ABC");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ABC");

	}

}
