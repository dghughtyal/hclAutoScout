package actions;

import static org.junit.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.AutoScoutHome_Elements;
import steps.Common_Steps;

public class AutoScoutKaufen_Actions {
	
	WebDriver driver;
	AutoScoutHome_Elements autoscouthome_elements;
	
	public AutoScoutKaufen_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		autoscouthome_elements = new AutoScoutHome_Elements(driver);
	}
	
	public void setDDdeatilsmake(String str) {
		Select makedd = new Select(autoscouthome_elements.makeItem);
		makedd.selectByVisibleText(str);
	}
	
	public void setDDdeatilsmodel(String str) {
		Select makedd = new Select(autoscouthome_elements.modelItem);
		makedd.selectByVisibleText(str);
	}
	
	public void setDDdeatilsprice(String str) {
		Select makedd = new Select(autoscouthome_elements.priceItem);
		makedd.selectByVisibleText(str);
	}
	
	public void setDDdeatilsfrstRegYY(String str) {
		Select makedd = new Select(autoscouthome_elements.firstRegYearItem);
		makedd.selectByVisibleText(str);
	}
	
	public void setLocation(String str) throws Exception {
		autoscouthome_elements.locSearcBox.sendKeys(str);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(autoscouthome_elements.locSuggstnList));
		
		Thread.sleep(4000);
		if (autoscouthome_elements.locSuggstnList.isDisplayed()) {
			String liValue = autoscouthome_elements.loclistfirstItem.getText();
			if (liValue.contains(str)) {
				System.out.println("PLZ code present");
				autoscouthome_elements.loclistfirstItem.click();
			}		
		}

		
//		Robot r  = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
	}
	
	public void validateTrefferPage() throws Exception {
		String trefferCount = autoscouthome_elements.srchTrefferBtn.getText().trim();
		String actTrefferCount = trefferCount.replace("Treffer", "").trim();
		int trefferCountint = Integer.parseInt(actTrefferCount);
		if (trefferCountint > 0)
		{
			autoscouthome_elements.srchTrefferBtn.click();
			Thread.sleep(1000);
		
			if(!autoscouthome_elements.srchListItemMainPage.isDisplayed())
			{
				fail("there is no list of items for search value");
			}
		}	
	}
	
	public void autoscoutLogoClick() {
		autoscouthome_elements.autoScoutLogo.click();
	}
	
}
