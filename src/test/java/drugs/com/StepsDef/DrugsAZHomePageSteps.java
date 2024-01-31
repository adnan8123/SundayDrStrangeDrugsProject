package drugs.com.StepsDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drugs.com.pageActions.DrugsAZHomePageActions;

public class DrugsAZHomePageSteps {
	
	DrugsAZHomePageActions DrugsAZHomePageActionsObj = new DrugsAZHomePageActions();
	
	
	@Given("^Open Drugs HomePage$")
	public void open_Drugs_HomePage() throws Throwable {
	    
	}

	@When("^the user click to the Drugs A-Z section$")
	public void the_user_click_to_the_Drugs_A_Z_section() throws Throwable {
		DrugsAZHomePageActionsObj.verifyDrugsAZItems();
	}

	@When("^the user should see an alphabetical list of drugs$")
	public void the_user_should_see_an_alphabetical_list_of_drugs() throws Throwable {
		
	}

	@Then("^each drug in the list should be clickable$")
	public void each_drug_in_the_list_should_be_clickable() throws Throwable {
	   
	}

}