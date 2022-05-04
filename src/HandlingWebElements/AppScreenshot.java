package HandlingWebElements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Step 1: Typecasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Step 2: access method and store it in RAM
		File ram = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Specify the Location
		 File destination = new File ("./photo/flipkart.png");
		
		//Step 4: Copy and Paste RAM to Destination Location
		FileUtils.copyFile(ram, destination);   
		
		driver.close();

	}

}
