package HandlingWebElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);

		s.selectByIndex(0);
		s.selectByValue("4");
		s.selectByVisibleText("Sep");
		
		System.out.println(s.isMultiple());
		
		List<WebElement> mon = s.getOptions();
		System.out.println(mon.size());
		
		ArrayList a = new ArrayList<>();
		for(WebElement alloption : mon) {
			String text = alloption.getText();
			a.add(text);
			System.out.println(text);
		}
		
		Collections.sort(a);
		System.out.println("After Sorting");
		
		for (Object b:a ) {
			System.out.println(b);
		}
		
		driver.close();

	}

}
