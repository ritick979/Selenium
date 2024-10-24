package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 

	     driver.manage().window().maximize();
			
			driver.get("https://v1.training-support.net/selenium/drag-drop"); 
			
			Actions ac = new Actions(driver); 
			
			WebElement ball = driver.findElement(By.cssSelector("#draggable")); 
			
			// Dropdown in Left box
			
			WebElement box = driver.findElement(By.id("droppable")); 
			
			// dropdown in Right box
			
			WebElement box2 = driver.findElement(By.id("dropzone2"));
			
			ac.dragAndDrop(ball, box).build().perform(); 
			
			ac.dragAndDrop(ball, box2).build().perform(); 

	}

}
