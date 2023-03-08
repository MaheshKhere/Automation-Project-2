package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Feature/google.feature" }, glue = {
		"stepDefination" }, monochrome = true, plugin = { "pretty", "html:target/htmlgoogleReports" })
public class googleTestRunner {

}
