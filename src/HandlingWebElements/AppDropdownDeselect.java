package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppDropdownDeselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement dd = driver.findElement(By.id("cars"));
		Select s = new Select(dd);
		
		s.selectByIndex(1);
		s.selectByValue("299");
		s.selectByVisibleText("More Than INR 500 ( 55 )");
		
		s.deselectByIndex(1);
		s.deselectByValue("299");
		s.deselectByVisibleText("More Than INR 500 ( 55 )");
	
		
		driver.close();
		

	}

}
