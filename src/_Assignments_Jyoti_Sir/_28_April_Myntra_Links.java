package _Assignments_Jyoti_Sir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _28_April_Myntra_Links {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		List<WebElement> links= driver.findElements(By.xpath("//a"));
        
		System.out.println(links.size());
		
		for(int i =0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText()); // for Printing Names of Webelements 
			System.out.println(links.get(i).getAttribute("href"));
		}
	}

}
