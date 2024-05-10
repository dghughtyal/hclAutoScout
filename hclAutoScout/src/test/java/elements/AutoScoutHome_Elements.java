package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoScoutHome_Elements {

	WebDriver driver;
	
	@FindBy(xpath = "//div[starts-with(@class,'_consent-popup-inner')]") public WebElement consentPopup;
	@FindBy(xpath = "//button[starts-with(@class,'_consent-accept')]") public WebElement consentAcceptBtn;
	@FindBy(xpath = "//button[@aria-label='Change language']/img") public WebElement countryBtn;
	@FindBy(xpath = "//div[@class='hfo-nav__submenu__items']/a/span") public List<WebElement> countrylist;
	@FindBy(xpath = "//li[@class ='hfo-nav__topic']/button[@class ='hfo-nav__button__with-submenu-icon']") public List<WebElement> headertype;
	@FindBy(xpath="//div[@class ='hfo-nav__submenu']/div/a") public List<WebElement> header_subOption;

	@FindBy(id = "make") public WebElement makeItem;
	@FindBy(id = "model") public WebElement modelItem;
	@FindBy(id = "price") public WebElement priceItem;
	@FindBy(id = "firstRegistration") public WebElement firstRegYearItem;
	
	@FindBy(id = "location") public WebElement locSearcBox;
	@FindBy(xpath = "div[@class='suggestions']/div/ul/li") public WebElement locSuggstnList;
	@FindBy(xpath = "//div[@class='suggestions']/div/ul/li[@id='location-suggestion-0']/span") public WebElement loclistfirstItem;
	@FindBy(xpath = "//a[contains(@class,'__search-button')]/span") public WebElement srchTrefferBtn;
	@FindBy(xpath = "//main[starts-with(@class,'ListPage_main')]") public WebElement srchListItemMainPage;
	
	@FindBy(xpath = "//a[@class='hfo-header__logo-auto24'][@xpath='1']") public WebElement autoScoutLogo;
	
	public AutoScoutHome_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
