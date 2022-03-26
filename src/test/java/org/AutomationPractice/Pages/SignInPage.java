package org.AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    public SignInPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(){
        email.sendKeys("udctest@gmail.com");
    }

    public void enterPassword(){
        password.sendKeys("UDCTEST");
    }

    public void clickOnSignIn(){
        signInButton.click();
    }
}
