package _Assignments_Jyoti_Sir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class __28_April_Bing__Search__Engine {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bing.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("sb_form_q")).sendKeys("guitar");
		
		List<WebElement> bing= driver.findElements(By.xpath("//span[text()='guitar ']"));
		System.out.println(bing.size());
		
		for(int i =0;i<bing.size();i++)
		{
			Thread.sleep(6000);
			System.out.println(bing.get(i).getText());
		}
		bing.get(4).click();
	}

}
