package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Broken_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
			
			List<WebElement> links = driver.findElements(By.tagName("a")); 
			
			for (WebElement link : links) {
				
				String url = link.getAttribute("href"); 
									
				try { 
				if (url != null) {
					driver = new FirefoxDriver(); 
					driver.get(url); 
					String title = driver.getTitle(); 
				if (title.equalsIgnoreCase("not found") ||title.contains("402")|| title.contains("502")|| title.isEmpty()) 
					
				   System.out.println("The link is broken link"+url); 
				
				else 
					System.out.println("Invalid URL");
					
				} 
						
			}
			
           catch (Exception e) {
			// TODO: handle exception
		}
				driver.close();
	}
			driver.quit();
							
	}
}	

