package org.AutomationPractice.pages;

import org.AutomationPractice.pageObjects.OrderObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends OrderObjects {


    public OrderPage(WebDriver driver){
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
