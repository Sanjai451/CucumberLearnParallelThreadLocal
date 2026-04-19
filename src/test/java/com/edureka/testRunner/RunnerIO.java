package com.edureka.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/java/com/edureka/featureFile/parallelExecution.feature"},
		glue = "com.edureka.stepDefinition",
//		dryRun = false
		plugin   = {
		        "pretty",
		        "html:target/cucumber-report.html",
		        "json:target/cucumber.json"
		    },
		monochrome = true
		)
public class RunnerIO extends AbstractTestNGCucumberTests {
	@Override
    @org.testng.annotations.DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
