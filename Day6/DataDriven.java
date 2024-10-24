package Day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		try {
			
			 WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://www.facebook.com"); 
				
					
				
				FileInputStream fis = new FileInputStream("‪‪C:\\Users\\Mr\\Documents\\Book124.xlsx"); 
				
				Workbook book = WorkbookFactory.create(fis); 
				
				String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue(); 
				
				String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue(); 
				
				driver.findElement(By.name("email")).sendKeys(username); 
				
				driver.findElement(By.name("pass")).sendKeys(password); 
				
				driver.findElement(By.name("login")).click();
				
				book.close(); 
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
