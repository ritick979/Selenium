package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();  
		
		 driver.get("https://www.instagram.com/accounts/login/?hl=en"); 
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ritick"); 
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Raj"); 
		 
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}
