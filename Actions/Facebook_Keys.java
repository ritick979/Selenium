package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/"); 
			
			WebElement email = driver.findElement(By.id("email")); 
			
			WebElement password = driver.findElement(By.id("pass"));  
			
			Actions act = new Actions(driver); 
			
			act.keyDown(email,Keys.SHIFT).sendKeys("ritick").keyUp(email,Keys.SHIFT).build().perform(); 
			
			String pass = "ranthorx1517"; 
			
			password.sendKeys(pass);
			
			for(int i=0; i<pass.length(); i++) {
				
				act.keyDown(password,Keys.BACK_SPACE).keyUp(password,Keys.BACK_SPACE).build().perform();
				
			}
			
		//	act.keyDown(password,Keys.SHIFT).sendKeys("ranthorx1517").keyUp(password,Keys.SHIFT).build().perform();
			
			

	}

}
