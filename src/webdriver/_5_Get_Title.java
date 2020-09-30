package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_Get_Title {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.myntra.com/");
			System.out.println(driver.getTitle());

	}

}
