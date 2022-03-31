package org.AutomationPractice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/org/AutomationPractice/features",
        glue="org.AutomationPractice.stepDefinition",dryRun = false,
        monochrome = true,
        plugin = {"rerun:target/failedTests.txt","io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" }
)
public class TestRunner {
}
