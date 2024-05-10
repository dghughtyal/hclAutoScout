package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "html:target/html-Report"},
		dryRun = false,
		//monochrome = false
		//name = {"Logo"}
		tags = "@P1"
		//tags = "@P0 and @P1"     //which has both P0 and P1 tag to it.
		//tags = "@P1 or @P2"        //which has either of one tag
		)
public class TestRunner {

}
