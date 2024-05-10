package steps;

import static org.junit.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.AutoScoutHome_Actions;
import actions.AutoScoutLogin_Actions;
import actions.Common_Actions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoScoutLogin_Steps {

//	WebDriver driver;
	WebDriverWait wait;
	
	Common_Actions common_actions;
	AutoScoutLogin_Actions autoscoutlogin_actions;
	
	public AutoScoutLogin_Steps(Common_Actions common_actions, AutoScoutLogin_Actions autoscoutlogin_actions) {
		//this.driver = common_steps.getDriver();
		this.common_actions = common_actions;
		this.autoscoutlogin_actions = autoscoutlogin_actions;
	}
	
	
	@When("I pass {string} and {string} to login")
	public void i_pass_and_to_login(String email, String pwd) throws Exception {
		
		autoscoutlogin_actions.homeLoginclick();
		
//		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[starts-with(@class,'email-input')]")));

		
		autoscoutlogin_actions.setEmailClick(email);
		
//		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='sign-in']/div[@role='dialog']/div[@class='top-spacing']/div/form")));

		autoscoutlogin_actions.setPwdLogin(email, pwd);

/*				
				if(driver.findElement(By.xpath("//input[starts-with(@class,'email-input') and @value='"+email+"']")).isDisplayed()) {
					
					driver.findElement(By.xpath("//input[starts-with(@class,'sc-input')]")).sendKeys(pwd);
					
					driver.findElement(By.xpath("//form/button[@class='button button-highlight']")).click();
					Thread.sleep(3000);
				}	*/

			
		}
	
	
	@Then("User navigates to My account Page")
	public void user_navigates_to_my_account_page() {
		
//		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-type='logged-in']/button/div/span[@class='hfo-nav__button__subtitle']")));
		
		autoscoutlogin_actions.validateUserAccPage();

	}


}
