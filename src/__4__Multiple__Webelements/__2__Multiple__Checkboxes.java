package __4__Multiple__Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class __2__Multiple__Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUMData/SELENIUMClasses/Classes/10.%20april28(Handling%20%20multiple%20webelements,Auto%20%20suggestions%20handling)/MultipleElements.html");
        
		List<WebElement> check= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(check.size()); // to tell the size 
		
		for(int i=0;i<check.size();i++)
		{
			Thread.sleep(1000);
			check.get(i).click();
		}
	}

}
