package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngInvocationcount {
	
	@Test (priority = -2)
	public void Chats() {
		Reporter.log("chats",true);
	}
	
	@Test (priority = -2, invocationCount=0) // As invocation Count is Zero it won't print
	public void Calls() {
		Reporter.log("calls",true);
	}
	
	@Test (invocationCount = 5) // default priority as Zero
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
