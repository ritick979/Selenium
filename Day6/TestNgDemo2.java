package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo2 { 
	
WebDriver driver; 
	
	@BeforeTest 
	public void setup() { 
		
		driver = new ChromeDriver();

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
	}

	@Test(enabled = false)
	
	public void SearchTest() {
							
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Gaming Laptop");
			
			driver.findElement(By.cssSelector("[value='Search']")).click();
			
			driver.findElement(By.xpath("(//span[@class='checkbox cbx x-refine__multi-select-checkbox undefined'])[1]")).click();
			
			driver.findElement(By.xpath("(//span[@class='checkbox cbx x-refine__multi-select-checkbox undefined'])[1]")).click();
		//	driver.findElement(By.xpath("//input[@aria-label='Intel UHD Graphics 620']")).click();
	}
	
@Test
	
	public void SearchChocolate() { 
	        driver.findElement(By.cssSelector(".ui-autocomplete-input")).clear();
							
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Dark chocolate");
			
			driver.findElement(By.cssSelector("[value='Search']")).click(); 
			
}

@Test

public void SearchIphone() { 
	    driver.findElement(By.cssSelector(".ui-autocomplete-input")).clear();
						
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Iphone");
		
		driver.findElement(By.cssSelector("[value='Search']")).click(); 
		
} 

@Test

public void SearchTshirt() { 
	    driver.findElement(By.cssSelector(".ui-autocomplete-input")).clear();
						
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("T-shirt");
		
		driver.findElement(By.cssSelector("[value='Search']")).click(); 
		
}

	@AfterTest 
	public void teardown() { 
		driver.close();

}


}
