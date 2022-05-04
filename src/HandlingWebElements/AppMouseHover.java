package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppMouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement mousehover = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(mousehover).perform();
		
		driver.findElement(By.xpath("//a[text()='Wall Décor']")).click();
		
		driver.close();
		}

}
