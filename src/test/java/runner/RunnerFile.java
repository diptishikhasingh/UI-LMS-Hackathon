package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", 
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		//"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
		"html:target/cucmberreport.html",
		"html:target/JUNITHtmlReports/report.html",
		"junit:target/JUNITReports/reports.xml"}, // reporting purpose
monochrome = true, // console output
tags = "", // tags from feature file
features = { "src/test/resources/features" }, // location of feature files
glue = { "stepDefinition","applicationHooks" }) // location of step definition files

public class RunnerFile extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
			
		return super.scenarios();
	}

}