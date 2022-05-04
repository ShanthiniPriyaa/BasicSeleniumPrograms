package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis = new FileInputStream("./data.xlsx");
		Workbook WB = WorkbookFactory.create(fis);
		String url = WB.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = WB.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = WB.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		

	}

}
