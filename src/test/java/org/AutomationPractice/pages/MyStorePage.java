package org.AutomationPractice.pages;

import org.AutomationPractice.pageObjects.MyStoreObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStorePage extends MyStoreObjects {

    public MyStorePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOnWomen(WebDriver driver){
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
