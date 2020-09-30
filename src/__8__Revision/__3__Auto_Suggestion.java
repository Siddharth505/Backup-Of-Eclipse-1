package __8__Revision;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class __3__Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("maths");
		
		Thread.sleep(4000);
		
		List<WebElement> auto = driver.findElements(By.xpath("//span[text()='maths']"));
        
		System.out.println(auto.size());
		
		for(int i =0;i<auto.size();i++)
		{
			System.out.println(auto.get(i).getText());
		}
		auto.get(6).click();
		System.out.println("YOYO");
	}

}
