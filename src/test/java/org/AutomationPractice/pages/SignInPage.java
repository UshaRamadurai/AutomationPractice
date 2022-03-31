package org.AutomationPractice.pages;

import org.AutomationPractice.Utilities.CommonUtils;
import org.AutomationPractice.pageObjects.SignInObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;



public class SignInPage extends SignInObjects {

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(){
        emaill.sendKeys(CommonUtils.prop.getProperty("Email"));
    }

    public void enterPassword(){
        password.sendKeys(CommonUtils.prop.getProperty("Password"));
    }

    public void clickOnSignIn(){
        signInButton.click();
    }
}
