package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertTest { 
	
WebDriver driver; 
	
	@BeforeMethod 
	public void setup() { 
		
		driver = new ChromeDriver();

	     driver.manage().window().maximize();
			
		driver.get("https://automationteststore.com/"); 
			
           String expectedtitle ="Contact Us"; 
			
			String actualtitle =driver.getTitle(); 
				 
			org.testng.Assert.assertEquals(actualtitle, expectedtitle); 
			
			org.testng.Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/"); 
			
			String url = driver.getCurrentUrl(); 
			
	} 
	
	@Test 
	public void test1() {
		
         WebElement check1 = driver.findElement(By.linkText("Contact Us")); 
		
	//	  org.testng.Assert.assertTrue(check1.isDisplayed());
		
		  check1.click(); 
		  
		//  org.testng.Assert.assertTrue(check1.isSelected()); 
		  
		  driver.findElement(By.cssSelector("[name=\"first_name\"]")).sendKeys("Ritick"); 
		  
		  driver.findElement(By.cssSelector("[id=\"ContactUsFrm_email\"]")).sendKeys("ritickraj35@gmail.com"); 
		  
		  driver.findElement(By.cssSelector("[name=\"enquiry\"]")).sendKeys("I want to take gaming laptop"); 
		  
		  driver.findElement(By.cssSelector("[title=\"Submit\"]")).click();
	}

	
	@AfterMethod 
	public void teardown() {
//		driver.close();
	}
}
