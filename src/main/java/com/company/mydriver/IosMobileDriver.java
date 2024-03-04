package com.company.mydriver;


import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class IosMobileDriver {


    private static DesiredCapabilities getCapabilities() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("deviceName", "");
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("app","/Users/rootuser/Documents/JAVA/mydemoapp-mobiletestautomation/apps/ios/" );
            return capabilities;
        } catch (Exception error) {
            throw new RuntimeException("Failed to generate iOS capabilities", error);
        }
    }

    @BeforeAll
    public static AndroidDriver buildIosDriver() {
        try{
            return new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"),
                    getCapabilities());
        } catch (Exception error) {
            throw new RuntimeException("Failed to build iOS Driver.", error);
        }
    }

}
