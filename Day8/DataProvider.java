package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider { 
	
	WebDriver driver;
	
	@BeforeMethod 
	public void setup() {
		
		driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/login"); 
		
	} 
	
	@Test(dataProvider  = "data")
	
	public void herokulogin(String username, String password) { 
		
		driver.findElement(By.id("username")).sendKeys(); 
		
		driver.findElement(By.id("password")).sendKeys();  
		
		driver.findElement(By.cssSelector(".radius")).click(); 
	} 
	
	@org.testng.annotations.DataProvider(name = "data") 
	public  Object[][] data(){ 
		return new Object[][] {
			
			new Object[] {"tom","super"}, 
			new Object[] {"smith","Sceret"}, 
			new Object[] {"tomsmith","SuperSceretPassword"}, 
			new Object[] {"","SuperSceretPassword!"}, 
			new Object[] {"tomsmith",""}, 
			new Object[] {"tomsmith","SuperSceretPassword!"}
		}; 
	}
	
	@AfterMethod 
	public void teardown() {
		
		driver.close();
	}

}
