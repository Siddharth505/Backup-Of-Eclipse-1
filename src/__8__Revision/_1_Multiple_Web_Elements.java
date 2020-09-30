package __8__Revision;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Multiple_Web_Elements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.airtelxstream.in/");
		
	List<WebElement> print = driver.findElements(By.xpath("//a"));
	System.out.println(print.size());
	
	for(int i=0;i<print.size();i++)
	{
		System.out.println(print.get(i).getText());
	}
     driver.findElement(By.xpath("//a[text()='Live TV']")).click();   
	
	}

}
