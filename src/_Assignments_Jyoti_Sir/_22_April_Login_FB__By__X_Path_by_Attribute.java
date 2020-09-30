package _Assignments_Jyoti_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _22_April_Login_FB__By__X_Path_by_Attribute {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("1010101");
		
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("PASSword");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("sidd.cool92@yahoo.in");
        
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("......");
		
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
	}

	}


