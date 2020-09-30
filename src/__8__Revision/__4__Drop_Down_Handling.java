package __8__Revision;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class __4__Drop_Down_Handling {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]//a[@role='button']")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select sel = new Select(day);
		
		sel.selectByIndex(10);
		sel.selectByValue("8");
        
		List<WebElement> print = sel.getOptions();
		print.size();
		
		for(int i =0;i<print.size();i++)
		{
			System.out.println(print.get(i).getText());
		}
	     
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 =new Select(month);
		sel1.selectByVisibleText("Mar");
	
	
	}

}
