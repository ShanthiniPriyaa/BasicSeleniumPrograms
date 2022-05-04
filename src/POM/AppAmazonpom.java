package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppAmazonpom {
	
	@FindBy(xpath="(//span[text()='All'])[2]")
	private WebElement all;
	
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement Signin;
	
	@FindBy(id="ap_email")
	private WebElement usernametb;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(id="ap_password")
	private WebElement pwdtb;
	
	@FindBy(id="signInSubmit")
	private WebElement subtbtn;
	
	
	public AppAmazonpom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void all() {
		all.click();
		
	}
	
	public void Signin() {
		Signin.click();
	}
	public void username(String username) {
		usernametb.sendKeys(username);
	}
	
	public void continuebutton() {
		continuebtn.click();
	}
	
	public void password(String pwd) {
		pwdtb.sendKeys(pwd);
	}
	
	public void submit() {
		subtbtn.click();
	}
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AppAmazonpom a = new AppAmazonpom (driver);
		a.all();
		a.Signin();
		a.username("admin");
		a.continuebutton();
		a.password("1234567890");
		a.submit();

	}

}
