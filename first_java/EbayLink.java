package first_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.ebay.com/"); 
		
		driver.findElement(By.linkText("Help & Contact")).click(); 
		
		driver.findElement(By.linkText("customer service page")).click();

	}

}
