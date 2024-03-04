package com.company.utilities.helpers;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.typesafe.config.Config;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppiumHelpers {

    private static final Logger log = LoggerFactory.getLogger(AppiumHelpers.class);
    private final AppiumDriver appiumDriver;
    private WebDriverWait webDriverWait;
    Config config;

    @Inject
    public AppiumHelpers(AppiumDriver appiumDriver, Config config) {
        this.appiumDriver = appiumDriver;
        this.config = config;
        this.webDriverWait =
                (WebDriverWait)
                        new WebDriverWait(appiumDriver, 20, 10)
                                .ignoring(NoSuchElementException.class);
    }

    /**
     * ********************************************************************************************
     * WAIT helper methods. Waits for the visibility of an element. Suggested use: 1) For dynamic
     * screen elements 2) When transitioning between screens
     * ********************************************************************************************
     */
    public void swipeAction(WebElement element, String direction)
    {
        ((JavascriptExecutor) appiumDriver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)element).getId(),
                "direction", direction,
                "percent", 0.75
        ));
    }

}
