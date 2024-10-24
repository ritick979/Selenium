package first_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#"); 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ui-autocomplete-input"))).sendKeys("Hello everyone"); 
		
		Thread.sleep(2000); 
						
	//	driver.findElement(By.className("ui-autocomplete-input")).sendKeys("hello everyone"); 
		
		
		driver.findElement(By.id("autocomplete")).clear(); 
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ui-autocomplete-input"))).sendKeys("Ritick Raj"); 
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='radio1']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("checkBoxOption1"))).click();
		
	//	driver.findElement(By.id("autocomplete")).sendKeys("Ritick Raj"); 
		
	//	driver.findElement(By.cssSelector("input[value='radio1']")).click(); 


	}

}
