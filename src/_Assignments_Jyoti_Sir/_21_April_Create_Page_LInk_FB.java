package _Assignments_Jyoti_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _21_April_Create_Page_LInk_FB {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Create Page")).click();
		System.out.println(driver.getCurrentUrl());
	}

}
