package _6__Mouse_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class __5__Drag_and_Drop {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source =  driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement target =  driver.findElement(By.xpath("(//div[text()='Italy'])"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();

	}

}
