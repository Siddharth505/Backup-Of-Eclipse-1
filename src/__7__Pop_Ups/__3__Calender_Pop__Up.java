package __7__Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class __3__Calender_Pop__Up {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
        
        WebElement city =  driver.findElement(By.xpath("(//input[@placeholder='City or airport'])[1]"));
        
        city.sendKeys("Las");
        
        Thread.sleep(4000);
        
        city.sendKeys(Keys.ARROW_DOWN);
        city.sendKeys(Keys.ENTER);
        
        WebElement city2 =  driver.findElement(By.xpath("(//input[@placeholder='City or airport'])[2]"));
        city2.sendKeys("san");
        Thread.sleep(4000);
        
        city2.sendKeys(Keys.ARROW_DOWN);
        city2.sendKeys(Keys.ENTER);
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
        
        driver.findElement(By.xpath("(//a[text()='25'])[1]")).click();
        
        driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
        
        driver.findElement(By.xpath("//a[@title='Next']"));
        
        for(int i=0;i<3;i++)
        {
        	driver.findElement(By.xpath("//a[@title='Next']")).click();
        }
        driver.findElement(By.xpath("(//a[text()='1'])[2]")).click();
        

	}

}
