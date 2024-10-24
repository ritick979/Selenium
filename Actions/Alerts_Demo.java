package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Demo {

	public static void main(String[] args) throws InterruptedException {  
		
				
				
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette"); 
			
				
		    driver.findElement(By.xpath("//button[@id=\'alertBox\']")).click();  
		    
		    String alertmsg = driver.switchTo().alert().getText(); 
			
			System.out.println(alertmsg); 
			
			Thread.sleep(1000);
			
			driver.switchTo().alert().dismiss(); 
		    
		  driver.switchTo().newWindow(null);
			
			driver.findElement(By.xpath("//button[@id=\'confirmBox\']")).click(); 
			
						
		
			    
			
				
	//		driver.findElement(By.xpath("//button[@id=\'promptBox\']")).click(); 
			
			

	}

}
