package com.company.mydriver;

import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.AppiumDriver;

public class AppiumDriverProvider implements Provider<AppiumDriver> {

    private static AppiumDriver sessionDriver;
    private final boolean useAndroid = System.getProperty("platform").equalsIgnoreCase("android");
    private final boolean useIos = System.getProperty("platform").equalsIgnoreCase("ios");

    public AppiumDriver get() {
        System.out.println("Building new Appium Driver");
        if (useAndroid) {
            sessionDriver = new AndroidMobileDriver().buildAndroidDriver();
        } else {
            sessionDriver = new IosMobileDriver().buildIosDriver();
        }
        return sessionDriver;
    }

    }

