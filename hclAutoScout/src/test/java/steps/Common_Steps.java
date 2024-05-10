package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Steps {
	
	private WebDriver driver;
	
	@Before(order = 1)
	public void setup() {
		driver = new ChromeDriver();
		System.out.println("Global Before Hook Executed.");
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) throws Exception {
		driver.quit();
		Thread.sleep(1000);  //1 second of wait time for closing the browser.
		System.out.println("Global After Hook Executed.");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
