package org.AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualDressesPage {

    @FindBy(id = "layer_cart_product_price")
    private WebElement productPrice;

    @FindBy(css = "span.ajax_block_products_total")
    private WebElement totalPrice;

    @FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
    private WebElement addToCartButton;

    @FindBy(css = "a.product_img_link")
    private WebElement productImg;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    private WebElement proceedToCheckoutButton;

    public CasualDressesPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getProductPrice(){
        String price= productPrice.getText();
        return price;
    }
    public void hoverOnProductImg(ChromeDriver driver){
        Actions builder = new Actions(driver);
        builder.moveToElement(productImg).perform();
    }
    public String getTotalPrice(){
        String price2 = totalPrice.getText();
        return price2;
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
}
