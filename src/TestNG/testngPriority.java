package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngPriority {
	
	@Test (priority = -2)
	public void Chats() {
		Reporter.log("chats",true);
	}
	
	@Test (priority = -2)
	public void Calls() {
		Reporter.log("calls",true);
	}
	
	@Test // default priority as Zero
	public void Message() {
		Reporter.log("message",true);
	}
	
	@Test (priority = 1)
	public void Settings() {
		Reporter.log("settings",true);
	}
	
	@Test (priority = -1)
	public void Voicecall() {
		Reporter.log("voicecall",true);
	}

}
