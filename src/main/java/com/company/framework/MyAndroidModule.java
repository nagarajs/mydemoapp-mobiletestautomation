package com.company.framework;

import com.company.contracts.Login;
import com.company.contracts.Menu;
import com.company.mydriver.AppiumDriverProvider;
import com.company.screens.android.LoginAndroidScreen;
import com.company.screens.android.MenuAndroidScreen;
import com.google.inject.AbstractModule;
import io.appium.java_client.AppiumDriver;

public class MyAndroidModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AppiumDriver.class).toProvider(AppiumDriverProvider.class);
        bind(Menu.class).to(MenuAndroidScreen.class);
        bind(Login.class).to(LoginAndroidScreen.class);
    }

}