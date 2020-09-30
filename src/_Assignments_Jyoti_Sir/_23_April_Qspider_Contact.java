package _Assignments_Jyoti_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _23_April_Qspider_Contact {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qspiders.com/contact");
		
		WebElement print= driver.findElement(By.xpath("(//a[text()='Noida'])[2]/../../..//div[contains ( text(),'+91')]"));
		System.out.println( "Contact Number of Qspiders Noida" +   print.getText());
		
		WebElement print2 = driver.findElement(By.xpath("(//a[text()='Basavanagudi'])[2]/../../..//div[ contains ( text(),'+91')]"));
		System.out.println("Contact Number 2 "  + print2.getText());

	}

}
