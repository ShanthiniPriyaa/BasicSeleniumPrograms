package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppEbayEnable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
		if(searchBtn.isEnabled()) {
			System.out.println("Pass : Search Button is Enabled");
		}
		else {
			System.out.println("Fail : Search Button is not Enabled");
		}
		
		driver.close();

	}

}
