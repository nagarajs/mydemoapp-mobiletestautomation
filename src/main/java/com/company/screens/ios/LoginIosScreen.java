package com.company.screens.ios;


import com.company.contracts.Login;
import com.google.inject.Inject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.apache.commons.lang3.NotImplementedException;

public class LoginIosScreen implements Login {

   private final AppiumDriver appiumDriver;

    @AndroidFindBy(accessibility = "")
    private WebElement username;

    @AndroidFindBy(accessibility = "")
    private WebElement password;

    @AndroidFindBy(accessibility = "")
    private WebElement loginButton;

    @AndroidFindBy(xpath = "")
    private WebElement usernameError;

    @AndroidFindBy(xpath = "")
    private WebElement passwordError;

    @AndroidFindBy(xpath = "")
    private WebElement errorMessage;

    @Inject
    public LoginIosScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public void enterUsername(String username) {
        throw new NotImplementedException("IOS implementation can be done here");
    }

    public void enterPassword(String password) {
        throw new NotImplementedException("IOS implementation can be done here");
    }

    public void login(String username, String password) {
        throw new NotImplementedException("IOS implementation can be done here");
    }

    public String getErrorMessage()
    {
        return errorMessage.getText();
    }

    public boolean verifyOnProductPage() {
        //ToDo
        return true;
    }



}
