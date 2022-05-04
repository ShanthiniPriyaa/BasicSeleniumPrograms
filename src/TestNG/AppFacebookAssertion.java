package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppFacebookAssertion {
	
public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		String title = driver.getTitle();
		
		
		//Assert/HardAssert
		
	    //Syntax: Assert.assertEquals(actual, expected);
	    Assert.assertEquals(title, "sdsgt1346mkmfi49");
	    
	    //SoftAssert
	    
	    /*Syntax: 
	     * SoftAssert s= new SoftAssert();
	     * s.assertEquals(actual,expected);
	     */
	    /*SoftAssert s= new SoftAssert();
	    s.assertEquals(title,"jdjwrui345868eugfn");*/
	    
		
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
		
		//s.assertAll();
	}
	
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
