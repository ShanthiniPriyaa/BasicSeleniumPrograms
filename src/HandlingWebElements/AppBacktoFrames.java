package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppBacktoFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement mousehover = driver.findElement(By.xpath("//a[text()=' Core Java For Selenium Trainin']"));
		mousehover.click();
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Play']")).click();
		driver.switchTo().defaultContent();
		Actions a = new Actions(driver);
		a.moveToElement(mousehover);
		driver.findElement(By.id("gdpr-cookie-message")).click();
		
		
		
	}

}
