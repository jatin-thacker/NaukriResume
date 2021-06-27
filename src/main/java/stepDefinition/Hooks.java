package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import common.BasePage;
import common.Utilities;

public class Hooks {
	@Before
	public static void setUp() throws Exception{
		String driver_name = Utilities.getProperty("driver_name");
		//System.out.println("Got property as " + driver_name);
		BasePage.setDriver(driver_name);
	}
	
	@After
	public static void tearDown() throws Exception{
		BasePage.closeDriver();
	}
}
