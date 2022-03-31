package org.AutomationPractice.webdriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.AutomationPractice.Utilities.CommonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;



public class DriverManager {

    public static WebDriver driver = null;
    private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
    public static void launchBrowser() {
        try{
            switch (CommonUtils.prop.getProperty("Browser")){
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    LOGGER.info("Launching Browser" );
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;
                case "Safari":
                    WebDriverManager.safaridriver().setup();
                    LOGGER.info("Launching Browser");
                    driver = new SafariDriver();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
