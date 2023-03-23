package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features ="C:\\Users\\kondapalli.krishna\\eclipse-workspace\\Ecommerce\\Features",
glue = {"stepdefinations"},monochrome = true,
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports/HtmlReports.html",
		"json:target/JsonReports/report.json"},tags="@sai")

public class TestRunner {

}


