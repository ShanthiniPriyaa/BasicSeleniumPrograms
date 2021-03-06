package HandlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("dres");
		Thread.sleep(3000);
		List<WebElement> search1 = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(search1.size());
		for(WebElement d : search1) {
			System.out.println(d.getText());
		}
		driver.close();
		
		

	}

}
