package _Assignments_Jyoti_Sir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _28_April_Multiple__Links_GSM_Marena {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> gsm =  driver.findElements(By.xpath("//a"));
        System.out.println(gsm.size());
        
        for(int i = 0;i<gsm.size();i++)
        {
        	Thread.sleep(5000);
        	System.out.println(gsm.get(i).getText());
        	System.out.println(gsm.get(i).getAttribute("href")); 
        }
	}

}
