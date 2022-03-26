package org.AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
        @FindBy(css = "a.login")
        private WebElement signIn;

        public HomePage(ChromeDriver driver){
            PageFactory.initElements(driver, this);
        }

        public void clickOnSignin(){
            signIn.click();
        }
}
