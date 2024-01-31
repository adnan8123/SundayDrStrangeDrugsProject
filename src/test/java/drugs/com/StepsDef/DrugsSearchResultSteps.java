package drugs.com.StepsDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drugs.com.pageActions.DrugsSearchResultActions;

public class DrugsSearchResultSteps {
	
	DrugsSearchResultActions DrugsSearchResultActionsObj = new DrugsSearchResultActions();
	
	@Then("^the user should see the list of aspirin items$")
	public void the_user_should_see_the_list_of_aspirin_items() throws Throwable {
		DrugsSearchResultActionsObj.verifyAspirinItems();
	}
	
	}
	


