package drugs.com.pageActions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import drugs.com.pageElements.DrugsSearchResultLocators;
import drugs.com.utilities.SetupDriver;

public class DrugsSearchResultActions {
	
	DrugsSearchResultLocators DrugsSearchResultLocatorsObj;
	
	public DrugsSearchResultActions(){
		DrugsSearchResultLocatorsObj = new DrugsSearchResultLocators();
		PageFactory.initElements(SetupDriver.driver, DrugsSearchResultLocatorsObj);
		
		
	}
	
	public void verifyAspirinItems(){
		Assert.assertTrue(DrugsSearchResultLocatorsObj.txtAspirin.isDisplayed());
		
	}

}










