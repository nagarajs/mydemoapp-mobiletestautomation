package com.company.screens.android;


import com.company.contracts.Login;
import com.company.screens.Base;
import com.google.inject.Inject;

import com.google.inject.Provider;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndroidScreen extends Base implements Login {

    private final AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = "Username input field")
    private WebElement username;

    @AndroidFindBy(accessibility = "Password input field")
    private WebElement password;

    @AndroidFindBy(accessibility = "Login button")
    private WebElement loginButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='generic-error-message']/android.widget.TextView")
    private WebElement errorMessage;

    @Inject
    public LoginAndroidScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
    }

    public void enterUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        loginButton.click();
    }

    public String getErrorMessage()
    {
        return errorMessage.getText();
    }

    public boolean verifyOnProductPage() {
       WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
       return wait.until(ExpectedConditions.textToBePresentInElementLocated(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='container header']/android.widget.TextView"), "Products"));
    }

}
