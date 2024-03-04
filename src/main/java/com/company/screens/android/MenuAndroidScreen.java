package com.company.screens.android;

import com.company.contracts.Menu;
import com.company.screens.Base;
import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class MenuAndroidScreen extends Base implements Menu {

    private final AppiumDriver appiumDriver;

    @AndroidFindBy(xpath = "//*[@content-desc='open menu']/android.widget.ImageView")
    private WebElement hamburgerIcon;

    @AndroidFindBy(accessibility = "menu item catalog")
    private WebElement catalog;

    @AndroidFindBy(accessibility = "menu item log in")
    private WebElement login;

    @AndroidFindBy(accessibility = "menu item log out")
    private WebElement logout;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[contains(@text, 'LOG OUT')]")
    private WebElement logoutYes;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[contains(@text, 'OK')]")
    private WebElement logoutOK;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[contains(@text, 'You are successfully logged out.')]")
    private WebElement logoutMessage;

    @Inject
    public MenuAndroidScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
    }

    public void goToLogin() {
        hamburgerIcon.click();
        login.click();
    }

    public String goToLogout() {
        hamburgerIcon.click();
        logout.click();
        logoutYes.click();
        String logoutMessage = this.logoutMessage.getText();
        logoutOK.click();
        return logoutMessage;
    }



}
