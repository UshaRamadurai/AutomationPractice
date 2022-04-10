package org.AutomationPractice.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.AutomationPractice.Utilities.CommonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import java.io.IOException;

import static org.AutomationPractice.webdriverManager.DriverManager.driver;

public class WomenCheckOutDef extends Instantiation {
    private static final Logger LOGGER = LogManager.getLogger(WomenCheckOutDef.class);

    @Given("The user is logged in successfully and is on Home Page")
    public void the_user_is_logged_in_successfully_and_is_on_home_page() {
        LOGGER.info("Logged in Successfully");

    }
    @When("Hover on the Women Tab")
    public void hoverOnTheWomenTab() {
        myStorePage.hoverOnWomen(driver);
    }

    @When("Click on Casual Dresses")
    public void click_on_casual_dresses() {
        myStorePage.clickOnCasualDresses();

    }
    @When("Hover on the Product Image")
    public void hover_on_the_product_image() {
        casualDressesPage.hoverOnProductImg(driver);

    }
    @When("Click on Add to Cart button")
    public void click_on_add_to_cart_button() {
        casualDressesPage.clickAddToCartButton();

    }
    @When("Click on Proceed to checkout button")
    public void click_on_proceed_to_checkout_button() {
        try {
            CommonUtils.takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
       Assert.assertEquals(casualDressesPage.getProductPrice(),
              casualDressesPage.getTotalPrice(),"Price not same");
        casualDressesPage.clickProceedToCheckoutButton();



    }
    @Then("Order page should be displayed")
    public void order_page_should_be_displayed() {

    }
    @When("Click on Summary Proceed to checkout button")
    public void click_on_summary_proceed_to_checkout_button() {
        try {
            CommonUtils.takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(casualDressesPage.getTotalPrice(),orderPage.getTotalProducts(),"Price not same");
        orderPage.clickProceedToCheckOutBtn();
    }
    @When("Click on Address Proceed to checkout button")
    public void click_on_address_proceed_to_checkout_button() {
        orderPage.clickCheckOutAddBtn();
    }
    @When("Click on Agree check box button")
    public void click_on_agree_check_box_button() {
        orderPage.clickCheckBoxAgree();

    }
    @When("Click on Shipping Proceed to checkout button")
    public void click_on_shipping_proceed_to_checkout_button() {
        orderPage.clickCheckOutShippingBtn();

    }
    @When("Click on Pay by bank wire button")
    public void click_on_pay_by_bank_wire_button() {
        orderPage.clickPayByWire();

    }
    @When("Click on I confirm my order button")
    public void click_on_i_confirm_my_order_button() {
        myStorePage.clickIconfirmMyOrderBtn();

    }
    @Then("ORDER CONFIRMATION is displayed")
    public void order_confirmation_is_displayed() {
        Assert.assertEquals(orderConfirmationPage.verifyOrderConfirmation(),"ORDER CONFIRMATION", "order not confirm");
        try {
            CommonUtils.takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
