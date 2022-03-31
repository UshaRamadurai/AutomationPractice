package org.AutomationPractice.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInObjects {
    @FindBy(id = "email")
    public WebElement emaill;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "SubmitLogin")
    public  WebElement signInButton;
}
