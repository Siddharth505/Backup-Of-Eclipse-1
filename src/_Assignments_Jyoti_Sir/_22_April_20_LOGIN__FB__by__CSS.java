package _Assignments_Jyoti_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _22_April_20_LOGIN__FB__by__CSS {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("sidd.cool92@yahoo.in");
        
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("......");
		
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}
