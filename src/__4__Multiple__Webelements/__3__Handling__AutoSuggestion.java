package __4__Multiple__Webelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class __3__Handling__AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
		List<WebElement> suggestions= driver.findElements(By.xpath("//span[contains ( text(),'selenium')]"));
        
		Thread.sleep(9000);
		
		System.out.println(suggestions.size());
		
		for(int i = 0;i<suggestions.size();i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
		
		//suggestions.get(2).click();
		
	}

}
