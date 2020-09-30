package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _9_CSS_Selector {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUMData/SELENIUMClasses/Classes/april22/CSSSelector.html");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("TA");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("bad");
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("BATTO");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sidd");

	}

}
