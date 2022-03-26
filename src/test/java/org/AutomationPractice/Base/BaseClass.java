package org.AutomationPractice.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.AutomationPractice.Pages.HomePage;
import org.AutomationPractice.Pages.SignInPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class BaseClass {
    public ChromeDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        HomePage homePage= new HomePage(driver);
        homePage.clickOnSignin();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.enterEmail();
        signInPage.enterPassword();
        signInPage.clickOnSignIn();
    }



}
