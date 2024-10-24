package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Date {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html"); 
			
		//	driver.findElement(By.id("datepicker")).sendKeys("03/31/2003",Keys.ENTER);  
			
			driver.findElement(By.id("datepicker")).click();
			
			WebElement actualmonth = driver.findElement(By.cssSelector(".ui-datepicker-month")); 
			
			WebElement actualyear = driver.findElement(By.cssSelector(".ui-datepicker-year")); 
			
			String monthtext = actualmonth.getText(); 
			
			String yeartext = actualyear.getText(); 
			
			while (!(monthtext.equals("December")&&yeartext.equals("2025"))) { 
				
				driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
				
				monthtext = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText(); 
				
				
				yeartext = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
				
			}
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//td[@data-month='11']/a[.='31']")).click();
			
			
			
		// TODO Auto-generated method stub

	}

}
