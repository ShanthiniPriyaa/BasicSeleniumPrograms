package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngSkip {
	
	@Test (priority = -2)
	public void Chats() {
		Reporter.log("chats",true);
	}
	
	@Test (priority = -2, invocationCount=1)
	public void Calls() {
		Reporter.log("calls",true);
	}
	
	@Test (invocationCount = 2) // default priority as Zero
	public void Message() {
		Reporter.log("message",true);
	}
	
	@Test (priority = 1)
	public void Settings() {
		Reporter.log("settings",true);
	}
	
	@Test (enabled=false) // Skipped the testcase
	public void Voicecall() {
		Reporter.log("voicecall",true);
	}

}
