package _Assignments_Jyoti_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _21_April_Forgot_Password__Acti {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement Link = driver.findElement(By.linkText("Forgot your password?"));
		
		System.out.println(Link.getText());
		
		Link.click();
           
		System.out.println(driver.getCurrentUrl());
	}

}
