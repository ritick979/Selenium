package first_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleChoice {

	public static void main(String[] args) { 
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
			
			// storing multiple checkbox using findelements; //
			
			List<WebElement> checks = driver.findElements(By.cssSelector("[type='checkbox']"));
			
			for (WebElement ch : checks) { 
				
				ch.click();
				
			}
				
			
		// TODO Auto-generated method stub

	}

}
