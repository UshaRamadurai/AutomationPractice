package org.AutomationPractice.pages;

import org.AutomationPractice.pageObjects.CasualDressesObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CasualDressesPage extends CasualDressesObjects {

    public CasualDressesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getProductPrice(){
        String price= productPrice.getText();
        System.out.println(price);
        return price;
    }
    public void hoverOnProductImg(WebDriver driver){
        Actions builder = new Actions(driver);
        builder.moveToElement(productImg).perform();
    }
    public String getTotalPrice(){
        String price2 = totalPrice.getText();
        System.out.println(price2);
        return price2;
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }

}
