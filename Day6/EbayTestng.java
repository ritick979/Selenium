package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EbayTestng { 
	
	@Test
	
	public void SearchTest() {
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
			
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Gaming Laptop");
			
			driver.findElement(By.cssSelector("[value='Search']")).click();
			
			driver.findElement(By.xpath("//span[@class='checkbox cbx x-refine__multi-select-checkbox undefined']")).click();
			
			driver.findElement(By.xpath("//input[@aria-label='Intel UHD Graphics 620']")).click();
	}

}
