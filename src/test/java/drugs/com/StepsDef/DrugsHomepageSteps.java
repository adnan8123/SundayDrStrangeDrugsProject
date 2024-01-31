package drugs.com.StepsDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import drugs.com.pageActions.DrugsHomePageActions;

public class DrugsHomepageSteps {
	
	DrugsHomePageActions DrugsHomePageActionsObj = new DrugsHomePageActions();
	
	@Given("^Open Drugs Homepage$")
	public void open_Drugs_Homepage() throws Throwable {
		
	}

	@When("^the user search for aspirin in the search bar$")
	public void the_user_search_for_aspirin_in_the_search_bar() throws Throwable {
		DrugsHomePageActionsObj.SearchAspirin();
	}
	
	@When("^the user clicks on the Register link$")
	public void the_user_clicks_on_the_Register_link() throws Throwable {
		DrugsHomePageActionsObj.veriryRegisterLink();
	}

	
}