package first_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class First_java1 {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
