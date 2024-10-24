package first_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nike_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
			
			driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("nike"); 
			
			Thread.sleep(2000); 
			
			
			driver.findElement(By.cssSelector("//a[@id='ui-id-22']")).click(); 
		//	Thread.sleep(2000); 
			
			//driver.findElement(By.cssSelector("[value='Search']")).click();
		// TODO Auto-generated method stub

	}

}
