package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo { 
	WebDriver driver; 
	
	@BeforeMethod 
	public void setup() { 
		
		driver = new ChromeDriver();

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
	}
// use priority to run the test first according to the given number.
	@Test(priority = 0)
	
	public void SearchTest() {
							
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Gaming Laptop");
			
			driver.findElement(By.cssSelector("[value='Search']")).click();
			
			driver.findElement(By.xpath("(//span[@class='checkbox cbx x-refine__multi-select-checkbox undefined'])[1]")).click();
			
			driver.findElement(By.xpath("(//span[@class='checkbox cbx x-refine__multi-select-checkbox undefined'])[1]")).click();
		//	driver.findElement(By.xpath("//input[@aria-label='Intel UHD Graphics 620']")).click();
	}
	
@Test(priority = 1)
	
	public void SearchChocolate() {
							
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Dark chocolate");
			
			driver.findElement(By.cssSelector("[value='Search']")).click(); 
			
}

@Test(priority = 2)

public void SearchIphone() {
						
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Iphone");
		
		driver.findElement(By.cssSelector("[value='Search']")).click(); 
		
} 

@Test(priority = -3)

public void SearchTshirt() {
						
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("T-shirt");
		
		driver.findElement(By.cssSelector("[value='Search']")).click(); 
		
}

	@AfterMethod 
	public void teardown() { 
		driver.close();

}

}
