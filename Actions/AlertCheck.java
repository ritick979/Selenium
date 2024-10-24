package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
   WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Name\"]")).sendKeys("Ritick");
        
	//	driver.findElement(By.id("alertbtn")).click(); 
		
		driver.findElement(By.cssSelector("[value='Confirm']")).click(); 
		
		String alertmsg = driver.switchTo().alert().getText(); 
		
		System.out.println(alertmsg); 
		
		driver.switchTo().alert().accept(); 
		
		if (alertmsg.contains("Ritick")) { 
			
			driver.close();
		}
			
		

	}

}
