package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo { 
WebDriver driver; 
	
	@BeforeMethod 
	public void setup() { 
		
		driver = new ChromeDriver();

	     driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
			
			String expectedtitle ="Practice Page"; 
			
			String actualtitle =driver.getTitle(); 
				 
			org.testng.Assert.assertEquals(actualtitle, expectedtitle); 
			
			org.testng.Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/AutomationPractice/"); 
			
			String url = driver.getCurrentUrl(); 
			
			boolean status = url.contains("AutomationPractice"); 
			
			org.testng.Assert.assertTrue(status); 
	}
	
	@Test 
	public void test1() { 
		
		WebElement check1 = driver.findElement(By.id("checkBoxOption1")); 
		
		org.testng.Assert.assertTrue(check1.isDisplayed());
		
		check1.click(); 
		
		org.testng.Assert.assertTrue(check1.isSelected()); 
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click(); 
		
		String actualemail = driver.findElement(By.cssSelector(".top-left")).getText(); 
		
		Assert.assertEquals(actualemail, "contact@rahulshettyacademy.com"); 
		
	} 
	
	@Test 
	public void test2() { 
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click(); 
		
		SoftAssert sa = new SoftAssert(); 
		
		sa.assertEquals(driver.getTitle(), "Acadmey"); 
		
		driver.findElement(By.linkText("JOIN NOW")).click(); 
		
		sa.assertAll();
	}
	
	@AfterMethod(alwaysRun = true) 
	public void teardown() { 
		driver.close();
	}

}
