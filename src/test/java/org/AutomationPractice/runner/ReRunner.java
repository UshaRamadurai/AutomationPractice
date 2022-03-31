package org.AutomationPractice.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/failedTests.txt",
        glue="org.AutomationPractice.stepDefinition",dryRun = false,
        monochrome = true

)
public class ReRunner {
}
