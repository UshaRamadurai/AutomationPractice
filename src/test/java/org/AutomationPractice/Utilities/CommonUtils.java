package org.AutomationPractice.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.AutomationPractice.stepDefinition.CommonSteps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.AutomationPractice.webdriverManager.DriverManager;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.Properties;

public class CommonUtils {

    private static final Logger LOGGER = LogManager.getLogger(CommonUtils.class);
    public static Properties prop = null;

    public static void loadProperties() throws IOException {

        FileInputStream fileIp = new FileInputStream("src/main/resources/config.properties");
        prop = new Properties();
        prop.load(fileIp);

    }


    }

