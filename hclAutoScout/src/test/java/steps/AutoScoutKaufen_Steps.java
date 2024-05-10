package steps;

import static org.junit.Assert.fail;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.AutoScoutHome_Actions;
import actions.AutoScoutKaufen_Actions;
import actions.Common_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoScoutKaufen_Steps {
	
//	WebDriver driver;
	Common_Actions common_actions;
	AutoScoutKaufen_Actions autoscoutkaufen_actions;
	
	public AutoScoutKaufen_Steps(Common_Actions common_actions,AutoScoutKaufen_Actions autoscoutkaufen_actions) {
		this.common_actions = common_actions;
		this.autoscoutkaufen_actions = autoscoutkaufen_actions;
	}
	
	@When("I search for Autos")
	public void i_search_for_autos(DataTable dataTable) throws Exception {

		Thread.sleep(1000);
		
/*		List<WebElement> makelist = driver.findElements(By.cssSelector("div.hf-searchmask-form__filter__make>select>optgroup>option"));
		for(WebElement x :makelist) {
			if((x.getText().trim().toLowerCase()).equals((dataTable.cell(1, 0)).toLowerCase())) {
				x.click();
				break;
			}	
		}

		Thread.sleep(3000);
*/		

		if(!dataTable.cell(1, 0).isEmpty()) {
			
			autoscoutkaufen_actions.setDDdeatilsmake(dataTable.cell(1, 0));
		}
		
		if(!dataTable.cell(1, 1).isEmpty()) {
			autoscoutkaufen_actions.setDDdeatilsmodel(dataTable.cell(1, 1));
		}
		
		if(!dataTable.cell(1, 2).isEmpty()) {
			autoscoutkaufen_actions.setDDdeatilsprice(dataTable.cell(1, 2));
		}
		
		if(!dataTable.cell(1, 3).isEmpty()) {
			autoscoutkaufen_actions.setDDdeatilsfrstRegYY(dataTable.cell(1, 3));
			
		}	
		
		if(!dataTable.cell(1, 4).isEmpty()) {
			autoscoutkaufen_actions.setLocation(dataTable.cell(1, 4));
			Thread.sleep(2000);
		}

		
	}

	@Then("Validate the Result list Page")
	public void validate_the_result_list_page() throws Exception {

		autoscoutkaufen_actions.validateTrefferPage();

	}

	@Given("I am on Auto Leasing Angebote Page")
	public void i_am_on_auto_leasing_angebote_page() throws Exception {
		
		common_actions.goToUrl("https://www.autoscout24.de/leasing/angebote/");
		Thread.sleep(1000);	
	}
	
	@When("I click on AutoScout Logo")
	public void i_click_on_auto_scout_logo() {
		autoscoutkaufen_actions.autoscoutLogoClick();
	}
	
	@Then("I navigate to Home page")
	public void i_navigate_to_home_page() {
		String title = common_actions.getCurrentPageTitle();
		if(!title.equalsIgnoreCase("Gebrauchtwagen und Neuwagen bei AutoScout24")) {
			fail("Autoscout Logo click not navigating to home page");
		}

	}

}
