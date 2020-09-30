package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_X_Path_Group_By_Index {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[1]")).sendKeys("ARK");
		driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]")).sendKeys("BATA");

	}

}
