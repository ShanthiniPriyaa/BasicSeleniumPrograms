package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppFacebookSelected {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement newacc = driver.findElement(By.name("sex"));
		
		
		if(newacc.isSelected()) {
			System.out.println("Pass : Element is Selected ");
		}
		else {
			System.out.println("Fail : Element is not Selected ");
		}
		 driver.close();

	}

}
