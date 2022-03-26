package org.AutomationPractice.Tests;

import org.AutomationPractice.Base.BaseClass;
import org.AutomationPractice.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseClass {

    @Test
    public void checkOut(){

        MyStorePage storePage = new MyStorePage(driver);
        CasualDressesPage casualPage = new CasualDressesPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        OrderConfirmationPage confirmPage = new OrderConfirmationPage(driver);

        storePage.hoverOnWomen(driver);
        storePage.clickOnCasualDresses();
        casualPage.hoverOnProductImg(driver);
        casualPage.clickAddToCartButton();
        Assert.assertEquals(casualPage.getProductPrice(),
                casualPage.getTotalPrice(),"Price not same");
        casualPage.clickProceedToCheckoutButton();
        Assert.assertEquals(casualPage.getTotalPrice(),orderPage.getTotalProducts(),"Price not same");
        orderPage.clickProceedToCheckOutBtn();
        orderPage.clickCheckOutAddBtn();
        orderPage.clickCheckBoxAgree();
        orderPage.clickCheckOutShippingBtn();
        orderPage.clickPayByWire();
        storePage.clickIconfirmMyOrderBtn();
        Assert.assertEquals(confirmPage.verifyOrderConfirmation(),"ORDER CONFIRMATION", "order not confirm");
    }

}
