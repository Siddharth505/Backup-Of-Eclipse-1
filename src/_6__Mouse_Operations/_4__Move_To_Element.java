package _6__Mouse_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _4__Move_To_Element {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		WebElement essentials = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
        Actions act = new Actions(driver);
        act.moveToElement(essentials).perform();
        
        WebElement hairstyle= driver.findElement(By.xpath("//a[text()='Hair Styling']"));
        Thread.sleep(2000);
	    act.moveToElement(hairstyle).click(hairstyle).perform();
	
	}

}
