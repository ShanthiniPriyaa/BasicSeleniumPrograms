package locators;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppInsta {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("sfrnfjfn");
		driver.findElement(By.name("password")).sendKeys("fdgrgb");
		driver.findElement(By.xpath("//div [contains(@class,'qF0y9')]")).click();
		String title =driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram")) {
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
