package first_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayParticalLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); 

     driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/"); 
		
		driver.findElement(By.partialLinkText("Electron")).click(); 
		
		driver.findElement(By.partialLinkText("Deals")).click();
 
	}

}
