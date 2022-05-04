package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppChildBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		

		//new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		//new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.flipkart.com/");
		
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		//driver.close();// close the current opened window
		driver.quit();// close all opened window

	}

}

