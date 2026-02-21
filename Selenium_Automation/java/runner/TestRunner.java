package runner;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDef"},
        plugin = {"pretty","html:target/report.html"},
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}

