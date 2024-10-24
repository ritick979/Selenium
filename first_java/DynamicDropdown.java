package first_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException { 
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
			
			driver.findElement(By.cssSelector("[placeholder='Type to Select Countries']")).sendKeys("ja"); 
			
			Thread.sleep(2000); 
			
		//	driver.findElement(By.xpath("(//div[contains(text(),'Japan')])[1]")).click(); 
			
			// Storing dropdown elements using findelements. 
			
			List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item")); 
			
			// Iterating using for loop 
			
			for (WebElement opt : options) { 
				
				if (opt.getText().equals("Japan")) { 
					
					System.out.println(opt.getText()); 
					
					opt.click();
					
				}
				
			}
		// TODO Auto-generated method stub

	}

}
