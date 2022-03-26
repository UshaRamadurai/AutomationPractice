package org.AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStorePage {
    @FindBy(css = "a.sf-with-ul")
    private WebElement women;

    @FindBy(linkText = "Casual Dresses")
    private WebElement casualDresses;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    private WebElement paymentConfirm;


    public MyStorePage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOnWomen(ChromeDriver driver){
        Actions builder = new Actions(driver);
        builder.moveToElement(women).perform();
    }
    public void clickOnCasualDresses(){
        casualDresses.click();
    }

public void clickIconfirmMyOrderBtn(){
        paymentConfirm.click();
}

}
