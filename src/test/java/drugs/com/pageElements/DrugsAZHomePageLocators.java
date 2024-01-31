package drugs.com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsAZHomePageLocators {
	
	//Click on the Feature
	@FindBy(xpath="//a[1][contains(text(),'Drugs A-Z')]")
	public WebElement clickonDrugsAZLink;

}
