package __7__Pop_Ups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class __4__Child_Popup {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        driver.get("https://www.naukri.com/");
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        
		/*
		 * Set<String> a= driver.getWindowHandles(); System.out.println(a.size());
		 * ArrayList<String> b = new ArrayList<String>();
		 */
        }

}
