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

	
	public void verifyEmail() throws Throwable{
		DrugsRegisterResultLocatorsObj.EnterValidInfo.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		
	}
		
	
   
	public void verifyEmailButton() throws Throwable {
		DrugsRegisterResultLocatorsObj.ClicktoEmailButton.click();
		Thread.sleep(2000);
	}
	
	
	public void visibleErrorMsg(){
		DrugsRegisterResultLocatorsObj.SeeErrorMsg.isDisplayed();
	
	}
	
	
	
	
	
	
	
	
}




