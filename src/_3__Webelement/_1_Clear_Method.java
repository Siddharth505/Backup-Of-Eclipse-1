package _3__Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Clear_Method {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Clear= driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[1]"));
        Clear.sendKeys("Raja");
        Thread.sleep(5000);
        Clear.clear();
	}

}
