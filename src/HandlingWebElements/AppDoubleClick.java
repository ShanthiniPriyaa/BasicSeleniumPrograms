package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppDoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement mh = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a = new Actions(driver);
		a.moveToElement(mh).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		WebElement plusebtn = driver.findElement(By.id("add"));
		a.doubleClick(plusebtn).perform();
	
		driver.close();		

	}
	
	

}
