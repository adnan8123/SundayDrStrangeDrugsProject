package drugs.com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsHomePageLocators {
	
	//Search Text Box
	@FindBy(xpath="//input[@type='text']")
	public WebElement txtbxSearch;
	
	
	//Search Button
	@FindBy(xpath="//button[@class='ddc-btn']")
	public WebElement btnSearch;
	
	//Clink on Register Functionality
		@FindBy(xpath="//a[contains(text(),'Register')]")
		public WebElement clickonRegisterLink;
	
	
}









