package com.company.framework;

import com.company.contracts.Login;
import com.company.contracts.Menu;
import com.company.screens.ios.LoginIosScreen;
import com.company.screens.ios.MenuIosScreen;
import com.google.inject.AbstractModule;

public class MyIosModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Menu.class).to(MenuIosScreen.class);
        bind(Login.class).to(LoginIosScreen.class);
    }
}
