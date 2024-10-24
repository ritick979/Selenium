package first_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadio {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
			
			// storing multiple radio button using findelements //
			
			List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']")); 
			
			for (WebElement radio : radios) { 
				
				radio.click();
				Thread.sleep(1000);
				
			}
		// TODO Auto-generated method stub

	}

}
