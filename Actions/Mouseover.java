package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.shoppersstop.com/"); 
			
			Actions act = new Actions(driver);
			
			WebElement Watches_link = driver.findElement(By.linkText("WATCHES")); 
			
			act.moveToElement(Watches_link).build().perform();
			
		// TODO Auto-generated method stub

	}

}
