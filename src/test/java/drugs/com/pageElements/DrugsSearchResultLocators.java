package drugs.com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsSearchResultLocators {

	//Validate Aspirin Items
	@FindBy (xpath="//b[1][contains(text(),'Aspirin')]")
	public WebElement txtAspirin;
}
