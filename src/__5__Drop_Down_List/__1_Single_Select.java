package __5__Drop_Down_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class __1_Single_Select {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver","D:/SOFTWARES/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUMData/SELENIUMClasses/Classes/11.%20april29(drop%20down%20list%20handling)/SelectClass.html");

		WebElement dropdown =  driver.findElement(By.xpath("//select[@name='employess']"));
		
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Pooja");
		sel.selectByIndex(4);
		sel.selectByValue("M");
		
        
	}

}
