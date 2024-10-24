package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html"); 
			
			Actions act = new Actions(driver); 
			
			 WebElement rightclickele = driver.findElement(By.xpath("//*[.='right click me']")); 
			 
			 act.contextClick(rightclickele).build().perform();
			
		// TODO Auto-generated method stub

	}

}
