package first_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_form {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  
		
		 driver.get("https://www.facebook.com/signup"); 
		 
		 driver.findElement(By.xpath("//input[@name=\'firstname\']")).sendKeys("Ritick"); 
		 
		 driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("Raj"); 
		 
		 driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("8752394728"); 
		 
		 driver.findElement(By.xpath("//input[@aria-label=\"New password\"]")).sendKeys("Raju5614"); 
		 
		 driver.findElement(By.xpath("//select[@title=\"Day\"]")).sendKeys("13"); 
		 
		 driver.findElement(By.xpath("//select[@title=\"Month\"]")).sendKeys("May"); 
		 
		 driver.findElement(By.xpath("//select[@title=\"Year\"]")).sendKeys("2017");
		 
		 driver.findElement(By.xpath("//input[@value=\"2\"]")).click(); 
		 
		 driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click(); 
		 
		// driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("Raj");

		
	//	driver.get("https://v1.training-support.net/selenium/simple-form"); 
		
	//	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ritick"); 
		
		//driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Raj"); 
		
		//driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ritickraj35@gmail.com"); 
		
		//driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("1234567890"); 

	}

}
