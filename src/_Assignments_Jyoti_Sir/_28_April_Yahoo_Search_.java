package _Assignments_Jyoti_Sir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _28_April_Yahoo_Search_ {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://in.search.yahoo.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pikachu");
		
		List<WebElement> yahoo = driver.findElements(By.xpath("//b[text()='pikachu']"));
		
		System.out.println(yahoo.size());
		
		   
	}

}
