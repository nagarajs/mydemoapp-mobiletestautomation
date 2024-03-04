package com.company.utilities;

import io.cucumber.java.BeforeAll;

import static com.company.mydriver.AndroidMobileDriver.buildAndroidDriver;

public class Hooks {

    @BeforeAll
    void runDriver(){
       // Guice.createInjector(new MyFrameworkModule());
      //  buildAndroidDriver();
    }

}
