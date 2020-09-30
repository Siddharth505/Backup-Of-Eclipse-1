package _Assignments_Jyoti_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _23_April_Actitime__X_Path_Contains {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains  (text() , 'actiTIME Inc.')]")).click();
		
		driver.findElement(By.xpath("//a[contains ( text(), 'Forgot your password?')]")).click();
		
	}

}
