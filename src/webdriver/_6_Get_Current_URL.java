package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_Get_Current_URL {

	public static void main(String[] args) {
		
            
		 System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.myntra.com/");
			System.out.println(driver.getCurrentUrl());
			
			driver.get("https://www.myntra.com/shop/kids");
			System.out.println(driver.getCurrentUrl());
			
			
			
			
			
	}

}
