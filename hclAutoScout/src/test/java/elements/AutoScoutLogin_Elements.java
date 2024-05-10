package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoScoutLogin_Elements {

	WebDriver driver;
	
	@FindBy(className = "hfo-nav__login-button") public WebElement loginBtn;
	@FindBy(xpath = "//input[starts-with(@class,'email-input')]") public WebElement emailTextbox;
	
	@FindBy(xpath = "//form/button[@class='button button-highlight']") public WebElement submitEmailBtn;
	@FindBy(xpath = "//div[@id='sign-in']/div[@role='dialog']/div[@class='top-spacing']/div/form") public WebElement siginDialog;
//	@FindBy(xpath = "//input[starts-with(@class,'email-input')]") public WebElement siginEmailBox;
	@FindBy(xpath = "//input[starts-with(@class,'sc-input')]") public WebElement pwdTextbox;
	@FindBy(xpath = "//form/button[@class='button button-highlight']") public WebElement signInBtn;
	@FindBy(xpath = "//li[@data-type='logged-in']/button/div/span[@class='hfo-nav__button__subtitle']") public WebElement loggedInBtn;
	
	public AutoScoutLogin_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
