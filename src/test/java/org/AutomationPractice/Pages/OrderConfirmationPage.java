package org.AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {

    @FindBy(css = "h1.page-heading")
    private WebElement orderConfirmation;

    public OrderConfirmationPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String verifyOrderConfirmation(){
        String status = orderConfirmation.getText();
        return status;
    }
}
