package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html"); 
			
			Actions act = new Actions(driver); 
			
			 WebElement doubleclickele = driver.findElement(By.xpath("//*[.='Double-Click Me To See Alert']")); 
			 
			 act.doubleClick(doubleclickele).build().perform(); 

	}

}
