package drugs.com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsRegisterResultLocators {
	
	
	
	//Enter Valid Information
	@FindBy(xpath="//input[@type='email']")
	public WebElement EnterValidInfo;
	
	
	
	//Click on Submit Button
	@FindBy(css="input[value='Continue with email']")
	public WebElement ClicktoEmailButton;
	
	
	//Visible Error Message
	@FindBy(css="[class=ddc-text-color-danger]")
	public WebElement SeeErrorMsg;
	

	
		
}
