package _6__Mouse_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1__Left_Click {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement forgotpassword =  driver.findElement(By.xpath("//a[contains ( text(),'Forgotten')]"));
        
	    Actions act = new Actions(driver);
	    
	    act.click(forgotpassword).perform();
	}

}
