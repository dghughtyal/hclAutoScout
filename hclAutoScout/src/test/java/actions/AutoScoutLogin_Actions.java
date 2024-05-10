package actions;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.AutoScoutLogin_Elements;
import steps.Common_Steps;

public class AutoScoutLogin_Actions {

	WebDriver driver;
	AutoScoutLogin_Elements autoscoutlogin_elements;
	
	public AutoScoutLogin_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		autoscoutlogin_elements = new AutoScoutLogin_Elements(driver);
	}
	
	public void homeLoginclick() throws Exception {
		
		if(autoscoutlogin_elements.loginBtn.isEnabled()) {
			autoscoutlogin_elements.loginBtn.click();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Anmelden Button not enabled");
		}
	}
	
	public void setEmailClick(String email) {
		if(autoscoutlogin_elements.emailTextbox.isDisplayed()) {
			autoscoutlogin_elements.emailTextbox.sendKeys(email);
			autoscoutlogin_elements.submitEmailBtn.click();
		}
	}
	
	public void setPwdLogin(String email,String pwd) throws Exception {

		if(autoscoutlogin_elements.siginDialog.isDisplayed()) {
			String emailVal = autoscoutlogin_elements.emailTextbox.getAttribute("value");
			System.out.println(emailVal);
			if(emailVal.equals(email)) {
				
				autoscoutlogin_elements.pwdTextbox.sendKeys(pwd);
				
				autoscoutlogin_elements.signInBtn.click();
				Thread.sleep(3000);
		
			}			
			
		}
	}
	
	public void validateUserAccPage() {
		if(autoscoutlogin_elements.loggedInBtn.isDisplayed()) {
			String loginStatus = autoscoutlogin_elements.loggedInBtn.getText();
			System.out.println(loginStatus);	
			if(!(loginStatus.trim()).equalsIgnoreCase("Angemeldet")) {
				fail("User is not logged in");
			}
		}

	}
	
}
