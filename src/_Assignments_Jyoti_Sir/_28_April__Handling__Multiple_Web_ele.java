package _Assignments_Jyoti_Sir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _28_April__Handling__Multiple_Web_ele {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		List<WebElement> amazon = driver.findElements(By.xpath("//a"));
         
		System.out.println(amazon.size());
		
		for(int i =0;i<amazon.size();i++)
		{
			Thread.sleep(4000);
			System.out.println(amazon.get(i).getText());
		}
	
		
		
	}

}
