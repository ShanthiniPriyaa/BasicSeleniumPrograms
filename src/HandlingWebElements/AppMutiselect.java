package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppMutiselect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement dd = driver.findElement(By.id("cars"));
		Select s = new Select(dd);
		
		s.selectByIndex(1);
		s.selectByValue("299");
		s.selectByVisibleText("More Than INR 500 ( 55 )");
		
		System.out.println(s.isMultiple());
		
		
		if(s.isMultiple()) {
			s.deselectAll();
		}
		
		driver.close();

	}

}
