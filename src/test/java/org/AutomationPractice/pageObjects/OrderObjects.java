package org.AutomationPractice.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderObjects {
    @FindBy(css = "span.price")
    public WebElement totalProducts;

    @FindBy(css = "a.button.btn.btn-default.standard-checkout.button-medium")
    public WebElement proceedToCheckoutBtn;

    @FindBy(name = "processAddress")
    public WebElement checkOutAddBtn;

    @FindBy(name = "processCarrier")
    public WebElement checkOutShippingBtn;

    @FindBy(id = "cgv")
    public WebElement checkBoxAgree;

    @FindBy(css = "a.bankwire")
    public WebElement payByWire;
}
