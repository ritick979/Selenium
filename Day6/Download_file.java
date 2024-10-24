package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://demo.automationtesting.in/FileDownload.html"); 
			
			driver.findElement(By.xpath("//a[@class='btn btn-primary'] ")).click(); 
			
			driver.findElement(By.xpath("//textarea[@id='textbox'] ")).sendKeys("fugaxks");
			
			driver.findElement(By.xpath("//button[@id='createTxt'] ")).click();
			
			driver.findElement(By.xpath("//a[@id='link-to-download'] ")).click();
			

	}

}
