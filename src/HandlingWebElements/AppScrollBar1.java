package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppScrollBar1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement TO = driver.findElement(By.xpath("//h2[text()='Trending Offers']"));
		WebElement SW = driver.findElement(By.xpath("//div[text()='Wrist Watches']"));

		Point loc = TO.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		js.executeScript("arguments[0].click();", SW);
		
		 System.out.println(loc.getX()+ "  X- Coordinates");
		 System.out.println(loc.getY() + "  Y- Coordinates");
		
		  
		SW.click();
		
	}
}