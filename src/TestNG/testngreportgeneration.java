package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class testngreportgeneration {
	
	@Test
	public void testcase1() {
		
		Reporter.log("Hello",true);
		Reporter.log("Bye",false);
	}

}
