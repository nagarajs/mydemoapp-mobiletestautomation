package com.company.screens.ios;

import com.company.contracts.Menu;
import com.google.inject.Inject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebElement;

public class MenuIosScreen implements Menu {

    private final AppiumDriver appiumDriver;

    @AndroidFindBy(xpath = "")
    private WebElement hamburgerIcon;

    @AndroidFindBy(accessibility = "")
    private WebElement catalog;

    @AndroidFindBy(accessibility = "")
    private WebElement login;

    @AndroidFindBy(accessibility = "")
    private WebElement logout;

    @AndroidFindBy(xpath = "")
    private WebElement logoutYes;

    @AndroidFindBy(xpath = "")
    private WebElement logoutOK;

    @AndroidFindBy(xpath = "")
    private WebElement logoutMessage;

    @Inject
    public MenuIosScreen(AppiumDriver appiumDriver) {
    this.appiumDriver = appiumDriver;
    }

    public void goToLogin() {
        throw new NotImplementedException("IOS implementation can be done here");
    }

    public String goToLogout() {
        String message = "";
        return message;
    }



}
