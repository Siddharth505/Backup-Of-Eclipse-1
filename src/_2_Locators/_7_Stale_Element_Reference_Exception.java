package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _7_Stale_Element_Reference_Exception {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Link = driver.findElement(By.linkText("Forgotten account?"));
		
		Link.click();
		WebElement Link1 = driver.findElement(By.linkText("Forgotten account?"));
		System.out.println(Link1.getText());
		

	}

}
