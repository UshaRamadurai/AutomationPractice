package org.AutomationPractice.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationObjects {
    @FindBy(css = "h1.page-heading")
    public WebElement orderConfirmation;
}
