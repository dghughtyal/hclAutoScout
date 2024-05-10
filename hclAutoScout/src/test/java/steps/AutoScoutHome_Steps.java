package steps;

import static org.junit.Assert.fail;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.AutoScoutHome_Actions;
import actions.Common_Actions;
import elements.AutoScoutHome_Elements;
import elements.AutoScoutLogin_Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoScoutHome_Steps {


	Common_Actions common_actions;
	AutoScoutHome_Actions autoscouthome_actions;
//    Common_Steps common_steps;
	
	public AutoScoutHome_Steps(Common_Actions common_actions, AutoScoutHome_Actions autoscouthome_actions) {
		//this.driver = common_steps.getDriver();
		this.common_actions = common_actions;
		this.autoscouthome_actions = autoscouthome_actions;
	}
	
	@Given("I am on AutoScout Home Page")
	public void i_am_on_autoscout_home_page() throws Exception {
//		driver.get("https://www.autoscout24.de/");
		common_actions.goToUrl("https://www.autoscout24.de/");
		System.out.println("I am on AutoScout Home Page");
		
		Thread.sleep(3000);
//		driver.manage().window().maximize();
		common_actions.maximizeBrowser();
		
/*		if (driver.findElement(By.xpath("//div[starts-with(@class,'_consent-popup-inner')]")).isDisplayed()) {
			
			if(driver.findElement(By.xpath("//button[starts-with(@class,'_consent-accept')]")).isEnabled()) {
				driver.findElement(By.xpath("//button[starts-with(@class,'_consent-accept')]")).click();
			}
		}
	*/
		autoscouthome_actions.handleConsent();

			
/*			if(driver.findElement(By.xpath("//button[starts-with(@class,'_consent-accept')]")).isEnabled()) {
				driver.findElement(By.xpath("//button[starts-with(@class,'_consent-accept')]")).click();
			} */
			
		Thread.sleep(1000);
	}
	
	
	@When("I click on {string} from Country selector link")
	public void i_click_on_from_country_selector_link(String country) throws Exception {
		
//		driver.findElement(By.xpath("//button[@aria-label='Change language']/img")).click();
		autoscouthome_actions.selectCountry(country);
		
/*		List<WebElement> countrylist = driver.findElements(By.xpath("//div[@class='hfo-nav__submenu__items']/a/span"));
		for(WebElement x : countrylist) 
		{
			if((x.getText().trim().toLowerCase()).equals(country.toLowerCase())) 
			{
				System.out.println(x.getText());
				x.click();
				break;
			}
		} */
		
		
		Thread.sleep(3000);
/*		if (driver.findElement(By.xpath("//div[starts-with(@class,'_consent-popup-inner')]")).isDisplayed()) 
		{
			if(driver.findElement(By.xpath("//button[starts-with(@class,'_consent-accept')]")).isEnabled()) 
			{
				driver.findElement(By.xpath("//button[starts-with(@class,'_consent-accept')]")).click();
			}
			Thread.sleep(2000);
		}  */
		
		autoscouthome_actions.handleConsent();
		
	}
	
	@Then("I validate the page navigates to specific url that contains {string} and title contains {string}")
	public void i_validate_the_page_navigates_to_specific_url_that_contains_and_title_contains(String url, String title) {
		
		String actUrl = common_actions.getCurrentPageUrl();
		String actTitle = common_actions.getCurrentPageTitle();
		if(!actUrl.contains(url)) {
			fail("Page does not navigate to expected url: " + url);
			
		}
		
		if(!actTitle.contains(title)) {
			fail("Title mismatch");
		}
		
	}
	
	@When("I click on {string} from the header tab {string}")
	public void i_click_on_from_the_header_tab(String item, String type) throws Exception {

/*		List<WebElement> headertype = driver.findElements(By.xpath("//li[@class ='hfo-nav__topic']/button[@class ='hfo-nav__button__with-submenu-icon']"));
		//driver.findElement(By.xpath("//button[@data-tracking-linkid='buying']")).click();
		for(WebElement x : headertype) {
			if((x.getText().trim().toLowerCase()).equals(type.toLowerCase())) {
				x.click();
				break;
			}
		}   */
		
		
		autoscouthome_actions.selectHeaderOption(item, type);
		
	}
	@Then("I validate Page navigates to specific url and title contains {string}")
	public void i_validate_page_navigates_to_specific_url_and_title_contains(String title) {

		String actTitle = common_actions.getCurrentPageTitle();
		if(!actTitle.contains(title))
		{
			fail("Title mismatch");
		}
		
	}

}
