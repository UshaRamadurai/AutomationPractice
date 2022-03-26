package org.AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    @FindBy(css = "span.price")
    private WebElement totalProducts;

    @FindBy(css = "a.button.btn.btn-default.standard-checkout.button-medium")
    private WebElement proceedToCheckoutBtn;

    @FindBy(name = "processAddress")
    private WebElement checkOutAddBtn;

    @FindBy(name = "processCarrier")
    private WebElement checkOutShippingBtn;

    @FindBy(id = "cgv")
    private WebElement checkBoxAgree;

    @FindBy(css = "a.bankwire")
    private WebElement payByWire;

    public OrderPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getTotalProducts(){
        String totalPrice = totalProducts.getText();
        return totalPrice;
    }

    public void clickProceedToCheckOutBtn(){
        proceedToCheckoutBtn.click();
    }

    public void clickCheckOutAddBtn(){
        checkOutAddBtn.click();
    }
    public void clickCheckBoxAgree(){
        checkBoxAgree.click();
    }
    public void clickCheckOutShippingBtn(){
        checkOutShippingBtn.click();
    }
    public void clickPayByWire(){
        payByWire.click();
    }
}
