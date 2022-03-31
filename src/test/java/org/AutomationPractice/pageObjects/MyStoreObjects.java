package org.AutomationPractice.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyStoreObjects {
    @FindBy(css = "a.sf-with-ul")
    public WebElement women;

    @FindBy(linkText = "Casual Dresses")
    public WebElement casualDresses;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    public WebElement paymentConfirm;
}
