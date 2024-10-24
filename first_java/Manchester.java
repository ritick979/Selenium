package first_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manchester {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
			
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("manchester united jersey");
			
			driver.findElement(By.cssSelector("[value='Search']")).click();
			
			driver.findElement(By.cssSelector("[data-value='All Listings']")).click(); 
			
			driver.findElement(By.cssSelector("[data-value='US Only']")).click();
		// TODO Auto-generated method stub

	}

}
