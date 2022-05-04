package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppScrollBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript ("window.scrollBy(0,5000)"); //scrolldown)
		Thread.sleep(3000);
		js.executeScript ("window.scrollBy(0,-8000)");//scrollup

	}

}
