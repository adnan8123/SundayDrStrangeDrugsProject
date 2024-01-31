package drugs.com.pageElements;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpskillAutomationiframeLocators {
	
	//Home Button
	
	@FindBy(xpath="//p[contains(text(),'Home')]")
	public WebElement btnHome;

}
