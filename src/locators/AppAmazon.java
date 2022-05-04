package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppAmazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.linkText("All")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("ap_email")).sendKeys("admin");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("admin");
		driver.findElement(By.id("signInSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();

	}

}
