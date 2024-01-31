package drugs.com.utilities;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	
	@After
	public void afterActions(Scenario Scenario) throws Exception{
		
		
		
		SetupDriver.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}