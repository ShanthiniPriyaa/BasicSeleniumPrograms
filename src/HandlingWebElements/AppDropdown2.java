package HandlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppDropdown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		s.selectByIndex(8);
		s.selectByValue("search-alias=fashion");
		s.selectByVisibleText("Books");
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement op : allOptions) {
			System.out.println(op.getText());
		}
		
		driver.close();

	}

}
