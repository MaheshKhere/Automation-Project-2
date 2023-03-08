package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // here you run cucumber class
@CucumberOptions(features = { "src/test/resources/Feature/Cucumber.feature" }, glue = {
		"stepDefination" }, monochrome = true, plugin = { "pretty", "html:target/htmlReports" })
//CucumberOptions takes two argument 1.path of feature file 2.name of stepDefination folder in double quotes and curly braces
public class TestRunner {

}
