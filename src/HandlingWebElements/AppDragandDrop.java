package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppDragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement dragdrop3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement dragdrop2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		Actions a = new Actions (driver);
		a.dragAndDrop(dragdrop3, dragdrop2).perform();
		
		driver.close();

	}

}
