package first_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Internet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login"); 
		
		driver.findElement(By.cssSelector("input[@name=\'username\'] ")).sendKeys("Ritick"); 
		

	}

}
