package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppCss {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		

	}

}
