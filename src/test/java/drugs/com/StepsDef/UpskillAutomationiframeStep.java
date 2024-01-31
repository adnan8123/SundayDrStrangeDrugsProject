package drugs.com.StepsDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import drugs.com.pageActions.UpskillAutomationiframeActions;

public class UpskillAutomationiframeStep {
	
	UpskillAutomationiframeActions UpskillAutomationiframeActionsObj = new UpskillAutomationiframeActions();
	
	@Given("^Open Upskill Homepage$")
	public void open_Upskill_Homepage() throws Throwable {
		UpskillAutomationiframeActionsObj.LoadUpskillHomePage(); 
	}

	@When("^Click on iframe Home$")
	public void click_on_iframe_Home() throws Throwable {
		UpskillAutomationiframeActionsObj.ClickiframeHome(); 
	}

	@When("^it should reload iframe Homepage$")
	public void it_should_load_Automation_Homepage() throws Throwable {
		UpskillAutomationiframeActionsObj.verifyUpskillHomePage();
	
	}
	
	

}
