package org.AutomationPractice.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.AutomationPractice.Utilities.CommonUtils;
import org.AutomationPractice.pages.SignInPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.AutomationPractice.webdriverManager.DriverManager;

import static org.AutomationPractice.webdriverManager.DriverManager.driver;

public class LoginStepsDef {

    private static final Logger LOGGER = LogManager.getLogger(LoginStepsDef.class);
    SignInPage signinPage = new SignInPage(driver);

    @Given("User in home page")
    public void user_in_home_page() {
        DriverManager.getDriver().get(CommonUtils.prop.getProperty("APP_URL"));
    }

    @Given("Enter the emailID")
    public void enterTheEmailID() {
        signinPage.enterEmail();
    }

    @And("Enter the password")
    public void enterThePassword() {
        signinPage.enterPassword();
    }

    @When("Click on Sign In button")
    public void clickOnSignInButton() {
        signinPage.clickOnSignIn();
    }

    @Then("My Store page should be displayed")
    public void myStorePageShouldBeDisplayed() {
        String url = DriverManager.getDriver().getCurrentUrl();
        if(url.contains("my-account")){
            LOGGER.info("Successfully logged in");
        }
    }
}

