package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppAlertpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement mousehover = driver.findElement(By.xpath("//a[text()='COURSE']"));	
		Actions a = new Actions(driver);
		a.moveToElement(mousehover).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		WebElement alert = driver.findElement(By.xpath("//button[text()=' Add to Cart']"));
		alert.click();
		System.out.println(alert.getText());
		Alert al = driver.switchTo().alert();
		al.accept();
		//al.dismiss(); //cannot use both together ---> NoAlertPresentException
		
	}

	
}
