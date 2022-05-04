package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input [@class='_2IX_2- VJZDxU']")).sendKeys("admin");
		driver.findElement(By.xpath("//input [@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("admin");
		driver.findElement(By.xpath("//button [@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
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
