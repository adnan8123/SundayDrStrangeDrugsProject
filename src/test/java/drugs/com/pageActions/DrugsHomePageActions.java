package drugs.com.pageActions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import drugs.com.pageElements.DrugsHomePageLocators;
import drugs.com.utilities.SetupDriver;

public class DrugsHomePageActions {
	
	
	DrugsHomePageLocators DrugsHomePageLocatorsObj;
	
	public DrugsHomePageActions(){
		DrugsHomePageLocatorsObj = new DrugsHomePageLocators();
		PageFactory.initElements(SetupDriver.driver, DrugsHomePageLocatorsObj);
		
	}

	public void SearchAspirin(){
		DrugsHomePageLocatorsObj.txtbxSearch.sendKeys("Aspirin");
		DrugsHomePageLocatorsObj.btnSearch.click();
		
	}
	
	
	public void veriryRegisterLink(){
		DrugsHomePageLocatorsObj.clickonRegisterLink.click();
		
	}	
}

















