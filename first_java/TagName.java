package first_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.ebay.com/"); 
		// TODO Auto-generated method stub  
			
		    List<WebElement> Ebay_links = driver.findElements(By.tagName("a")); 
		    
		    for (WebElement link : Ebay_links) { 
		    	
		     String links_name = link.getText();
		     
		     System.out.println(links_name);
				
			}

	}

}
