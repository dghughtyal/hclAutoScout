package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.AutoScoutHome_Elements;
import steps.Common_Steps;

public class AutoScoutHome_Actions {

	WebDriver driver;
	AutoScoutHome_Elements autoscouthome_elements;
	
	public AutoScoutHome_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		autoscouthome_elements = new AutoScoutHome_Elements(driver);
	}
	
	public void handleConsent() {
		if(autoscouthome_elements.consentPopup.isDisplayed()) 
		{
			if(autoscouthome_elements.consentAcceptBtn.isEnabled()) {
				autoscouthome_elements.consentAcceptBtn.click();
			}			
		}
	}
	
	public void selectCountry(String country) {
		autoscouthome_elements.countryBtn.click();
		for(WebElement x : autoscouthome_elements.countrylist) 
		{
			if((x.getText().trim().toLowerCase()).equals(country.toLowerCase())) 
			{
				System.out.println(x.getText());
				x.click();
				break;
			}
		}
	}
	
	public void selectHeaderOption(String item, String type) throws Exception {

		for(WebElement x : autoscouthome_elements.headertype) {
			if((x.getText().trim().toLowerCase()).equals(type.toLowerCase())) {
				x.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		for (WebElement x : autoscouthome_elements.header_subOption) {
			if((x.getText().trim().toLowerCase()).equals(item.toLowerCase())) {
				x.click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	
}
