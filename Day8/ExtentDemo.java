package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo { 
WebDriver driver;  
ExtentReports reports; 
ExtentTest test;

@BeforeClass 
public void reportconfig() {
    reports = new ExtentReports("C:\\Users\\Mr\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Selenium_day1\\report.html"); 
    
    test = reports.startTest("Ebay_Search Testing"); 
}
	
	@BeforeMethod(alwaysRun = true) 
	public void setup() { 
		
		test.log(LogStatus.PASS, "Chrome browser is opened");
		
		driver = new ChromeDriver();

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
			
			if (driver.getCurrentUrl().equals(null)) { 
				test.log(LogStatus.FAIL, "URL not entered");
				
			}
			
			test.log(LogStatus.PASS, "Url entered");
	}

	@Test(priority = 0, groups = "smoke")
	
	public void SearchTest() {
							
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Gaming Laptop");
			
			driver.findElement(By.cssSelector("[value='Search']")).click();
			
			if (driver.getCurrentUrl().equals(null)) { 
				test.log(LogStatus.PASS, "Search for gaming laptop");
				
			}
			else {
				test.log(LogStatus.FAIL, "Searched failed");
			}
	} 
	
@Test(priority = 0, groups = "smoke")
	
	public void SearchTest2() {
							
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Laptop");
			
			driver.findElement(By.cssSelector("[value='Search']")).click(); 
			
			test.log(LogStatus.PASS, "Searched for laptop");
			
}
 
@Test(priority = 3, groups = "Sanity")

public void SearchTshirt() {
						
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("T-shirt");
		
		driver.findElement(By.cssSelector("[value='Search']")).click(); 
		
		test.log(LogStatus.PASS, "T-shirt");
		
} 




	@AfterMethod(alwaysRun = true) 
	public void teardown() { 
		driver.close();

} 

	@AfterClass 
	public void flush() {
		reports.flush();
		reports.close();
		
	}
	

}
