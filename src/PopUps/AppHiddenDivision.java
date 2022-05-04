package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppHiddenDivision {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login ")).click();
		driver.findElement(By.xpath("//button[text()='Apr 11 - Apr 17, 2022']")).click();
		driver.findElement(By.xpath("//a[text()='&nbsp;']")).click();
		driver.findElement(By.xpath("(//span[text()='2'])[2]")).click();

	}

}
