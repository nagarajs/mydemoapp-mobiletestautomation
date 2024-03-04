package com.company.framework;

import com.google.inject.Module;

public enum PlatformModule {

    IOS {
        @Override
        public Module getModule() {
            return new MyIosModule();
        }
    },

    ANDROID {
        @Override
        public Module getModule() {
            return new MyAndroidModule();
        }
    };

    public abstract Module getModule();

}
