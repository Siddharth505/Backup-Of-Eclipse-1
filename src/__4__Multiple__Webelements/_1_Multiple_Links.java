package __4__Multiple__Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Multiple_Links {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUMData/SELENIUMClasses/Classes/10.%20april28(Handling%20%20multiple%20webelements,Auto%20%20suggestions%20handling)/MultipleElements.html");
        
		List<WebElement> links= driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		//links.get(4).click();
		
		for(int i = 0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href")); 
		}
	}

}
