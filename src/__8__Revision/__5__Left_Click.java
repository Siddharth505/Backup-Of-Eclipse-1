package __8__Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class __5__Left_Click {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		/*
		 * WebElement mouse=
		 * driver.findElement(By.xpath("//a[contains ( text() , 'Forgotten')]"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.click(mouse).perform();
		 */
		
		/*
		 * WebElement doubll=
		 * driver.findElement(By.xpath("//a[contains ( text() , 'Forgotten')]"));
		 * Actions act2 = new Actions(driver); act2.doubleClick(doubll).perform();
		 */	
	      
		/*
		 * WebElement right =
		 * driver.findElement(By.xpath("//a[contains ( text() , 'Forgotten')]"));
		 * Actions act3= new Actions(driver); act3.contextClick(right).perform();
		 * act3.sendKeys("t").perform();
		 */
		WebElement right = driver.findElement(By.xpath("//a[contains ( text() , 'Forgotten')]"));
		Actions act3= new Actions(driver);
		act3.moveToElement(right);
		
	
	
	}

	
	
	
	
	
	
}
