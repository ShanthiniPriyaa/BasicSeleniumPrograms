package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appxp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		String title =driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up")) {
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
