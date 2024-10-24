package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayMouseOver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
			
			Actions act = new Actions(driver);
			
			WebElement Fashion_link = driver.findElement(By.linkText("Fashion")); 
			
			act.moveToElement(Fashion_link).build().perform(); 
			
            WebElement Electronics_link = driver.findElement(By.linkText("Electronics")); 
			
			act.moveToElement(Electronics_link).build().perform(); 
			
            WebElement Refurbished_link = driver.findElement(By.linkText("Refurbished")); 
			
			act.moveToElement(Refurbished_link).build().perform(); 
			
		// TODO Auto-generated method stub

	}

}
