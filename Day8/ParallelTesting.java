package Day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTesting { 
	WebDriver driver; 
	WebDriver driver1; 

	@Test 
	public void chrometest() {
	    driver = new ChromeDriver();
		
		driver.get("https://www.bstackdemo.com/"); 
		
		driver.manage().window().maximize(); 
		
		System.out.println(driver.getTitle());
	}
	
	@Test 
	public void firefoxtest() {
		
	    driver = new FirefoxDriver();
		
		driver1.get("https://www.bstackdemo.com/"); 
		
        driver1.manage().window().maximize(); 
		
		System.out.println(driver.getTitle());
	} 
	
	@AfterClass 
	public void teardown() {
		driver.quit();
		driver1.quit();
	}
}
