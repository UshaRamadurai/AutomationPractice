package org.AutomationPractice.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.AutomationPractice.Utilities.CommonUtils;
import org.AutomationPractice.webdriverManager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommonSteps {
    private static final Logger LOGGER = LogManager.getLogger(CommonSteps.class);

    @Before
    public void beforeScenario() {
        LOGGER.info("Execution Started");
        try {
            CommonUtils.loadProperties();
            LOGGER.info("Started CommonUtils");
            LOGGER.info("Checking Driver is null");
            if (DriverManager.getDriver() == null) {
                DriverManager.launchBrowser();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
