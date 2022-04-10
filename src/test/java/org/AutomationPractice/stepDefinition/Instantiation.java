package org.AutomationPractice.stepDefinition;

import org.AutomationPractice.pages.*;

import static org.AutomationPractice.webdriverManager.DriverManager.driver;

public class Instantiation {

    SignInPage signinPage = new SignInPage(driver);
    MyStorePage myStorePage = new MyStorePage(driver);
    CasualDressesPage casualDressesPage = new CasualDressesPage(driver);
    OrderPage orderPage = new OrderPage(driver);
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);

}
