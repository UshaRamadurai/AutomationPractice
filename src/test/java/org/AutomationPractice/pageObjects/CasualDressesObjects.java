package org.AutomationPractice.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasualDressesObjects {
    @FindBy(id = "layer_cart_product_price")
    public WebElement productPrice;

    @FindBy(css = "span.ajax_block_products_total")
    public WebElement totalPrice;

    @FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
    public WebElement addToCartButton;

    @FindBy(css = "a.product_img_link")
    public WebElement productImg;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    public WebElement proceedToCheckoutButton;


}
