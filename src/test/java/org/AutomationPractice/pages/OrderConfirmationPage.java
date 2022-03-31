package org.AutomationPractice.pages;

import org.AutomationPractice.pageObjects.OrderConfirmationObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends OrderConfirmationObjects {

    public OrderConfirmationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String verifyOrderConfirmation(){
        String status = orderConfirmation.getText();
        return status;
    }
}
