package drugs.com.pageActions;

import org.openqa.selenium.support.PageFactory;

import drugs.com.pageElements.DrugsAZHomePageLocators;
import drugs.com.utilities.SetupDriver;

public class DrugsAZHomePageActions {
	
	DrugsAZHomePageLocators DrugsAZHomePageLocatorsObj;
	
	
	public DrugsAZHomePageActions(){
		
		DrugsAZHomePageLocatorsObj= new DrugsAZHomePageLocators();
		PageFactory.initElements(SetupDriver.driver, DrugsAZHomePageLocatorsObj);
		
	}
	
	public void verifyDrugsAZItems(){
		DrugsAZHomePageLocatorsObj.clickonDrugsAZLink.click();
		
		
	}
	
	
}
