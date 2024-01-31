package drugs.com.pageActions;

import org.openqa.selenium.support.PageFactory;

import drugs.com.pageElements.DrugsRegisterResultLocators;
import drugs.com.utilities.SetupDriver;


public class DrugsRegisterPageActions {
	
	DrugsRegisterResultLocators DrugsRegisterResultLocatorsObj;
	
	public DrugsRegisterPageActions(){
		DrugsRegisterResultLocatorsObj = new DrugsRegisterResultLocators();
	PageFactory.initElements(SetupDriver.driver, DrugsRegisterResultLocatorsObj);
		
		
	}


	
	
	public void verifyEmail(){
		DrugsRegisterResultLocatorsObj.EnterValidInfo.sendKeys("abc@gmail.com");
		DrugsRegisterResultLocatorsObj.ClicktoEmailButton.click();
	}
		
	
   
	public void verifyEmailButton(){
		DrugsRegisterResultLocatorsObj.ClicktoEmailButton.click();
	}
	
	
	public void visibleErrorMsg(){
		DrugsRegisterResultLocatorsObj.SeeErrorMsg.isDisplayed();
	
	}
	
	
	
	
	
	
	
	
}




