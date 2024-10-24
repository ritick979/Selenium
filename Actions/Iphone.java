package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iphone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		
		try {
			
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
			
			WebElement search = driver.findElement(By.cssSelector(".ui-autocomplete-input")); 
			
			Actions act = new Actions(driver);
			
			search.sendKeys("iphone"); 
			
			act.keyDown(search,Keys.ENTER).keyUp(search,Keys.ENTER).build().perform(); 
			
	} catch (Exception e) {
		
	}
			
		//	driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("iphone"); 
			
		//	Thread.sleep(2000); 
			
		//	driver.findElement(By.cssSelector("[value='Search']")).click();

	}

}
