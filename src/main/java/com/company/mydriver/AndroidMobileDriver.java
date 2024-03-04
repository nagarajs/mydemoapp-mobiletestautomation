package com.company.mydriver;


import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;

public class AndroidMobileDriver {


    private static DesiredCapabilities getCapabilities() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("app","/Users/rootuser/Documents/JAVA/mydemoapp-mobiletestautomation/apps/android/Android-MyDemoAppRN.1.3.0.build-244.apk" );
            return capabilities;
        } catch (Exception error) {
            throw new RuntimeException("Failed to generate Android capabilities", error);
        }
    }


    @BeforeAll
    public static AndroidDriver buildAndroidDriver() {
        try{
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                    getCapabilities());
        } catch (Exception error) {
            throw new RuntimeException("Failed to build Android Driver.", error);
        }
    }

}
