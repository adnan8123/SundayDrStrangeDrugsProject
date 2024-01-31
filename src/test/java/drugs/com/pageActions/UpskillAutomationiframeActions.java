package drugs.com.pageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import drugs.com.pageElements.UpskillAutomationiframeLocators;
import drugs.com.utilities.SetupDriver;

public class UpskillAutomationiframeActions {
	
	UpskillAutomationiframeLocators UpskillAutomationiframeLocatorsObj;
	
	public UpskillAutomationiframeActions(){
		UpskillAutomationiframeLocatorsObj = new UpskillAutomationiframeLocators();
		PageFactory.initElements(SetupDriver.driver, UpskillAutomationiframeLocatorsObj);
		
	}
	
	public void LoadUpskillHomePage() throws Exception{
		SetupDriver.driver.get("https://www.upskillconsultancy.com/automation-practice");
		Thread.sleep(3000);
		
	}

	
	public void ClickiframeHome(){
		
		List<WebElement> framelist = SetupDriver.driver.findElements(By.xpath("(//strong[contains(text(),'iFrame')]"));
		
		for(int i=0; i<framelist.size(); i++){
			SetupDriver.driver.switchTo().frame(i);
			
		}	
				
		try {
			UpskillAutomationiframeLocatorsObj.btnHome.click();
			
			
		}	catch (Exception e){
			System.out.println("Element Not Found in iframe");
			
		}	
			
			
		}
		
	
	
	public void verifyUpskillHomePage() throws Exception{
		Thread.sleep(3000);
		UpskillAutomationiframeLocatorsObj.btnHome.isDisplayed();
		
		
	}
	
}


