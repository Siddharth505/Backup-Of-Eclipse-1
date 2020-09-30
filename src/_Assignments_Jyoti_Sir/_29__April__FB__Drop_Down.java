package _Assignments_Jyoti_Sir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _29__April__FB__Drop_Down {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]//a[  text()='Create New Account']")).click();
		WebElement day= driver.findElement(By.id("day"));
		
		Select sel = new Select(day);
		sel.selectByIndex(4);
		
		List<WebElement> print= sel.getOptions();
		System.out.println(print.size());
		
		for(int i=0;i<print.size();i++)
		{
			System.out.println(print.get(i).getText());
		}
		
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 = new Select(month);
		sel1.selectByVisibleText("Dec");
		
		List<WebElement> print2 = sel1.getOptions();
		System.out.println(print2.size());
		
		for(int i=0;i<print2.size();i++)
		{
			System.out.println(print2.get(i).getText());
		}
		
		
		
		
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select sel2 = new Select(year);
		sel2.selectByValue("1992");
     
		System.out.println("Drop Down For DOB");
		
	}

}
