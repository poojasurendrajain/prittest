package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features\\Login.feature",
		glue="stepDefination",
		plugin = {"json:target/cucumber-reports/CucumberReport.json"}
		)

public class LoginRunner {

}
