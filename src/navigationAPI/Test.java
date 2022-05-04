package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000); // it takes some time delay
		//Back
		driver.navigate().back();
		
		Thread.sleep(3000);
		//Forward
		driver.navigate().forward();
		
		Thread.sleep(3000);
		//Refresh
		driver.navigate().refresh();
		

		Thread.sleep(3000);
		//close
		driver.close();
		;

	}

}
