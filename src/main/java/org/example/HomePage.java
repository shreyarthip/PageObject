package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends  Util {
    private By _registerButton = By.linkText("Register");
    private By _Computer = By.linkText("Computers");
    private By _Books = By.linkText("Books");
    private By _searchInputBox = By.id("small-searchterms");
    private By _WelcomeTitleText = By.xpath("//div[@class=\"topic-block-title\"]/h2");
    String expectedTitleOfThePage = "Welcome to our store";

    public void verifyUserOnHomePage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        getTextFromElement(_WelcomeTitleText);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Assert.assertEquals(_WelcomeTitleText, expectedTitleOfThePage);
    }
    public void clickOnRegisterButton() {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        clickOnElement(_registerButton,20);
    }
    public void ClickOnComputer(){
        clickOnElement(_Computer,20);
    }
    public void clickOnBooks(){
        clickOnElement(_Books,20);
    }
}






