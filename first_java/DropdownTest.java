package first_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
			
			// Write Locator for dropdown. 
			
			WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example")); 
			
			// Create Select class object. 
			
			Select s = new Select(dropdown); 
			
			// Indexing always start from 0 in dropdowns 
			
			s.selectByIndex(3);
			
			// Selecting by visible text.
			
			s.selectByVisibleText("Option2"); 
			
			// Selecting by value. 
			
			s.selectByValue("option1"); 
		

	}

}
