# About the Mobile Automation Framework
This mobile automation framework is designed to run on both iOS and Android platform. The design features implemented here are
* BDD feature 
* Page Object Model design
* Dependency Injection using Guice
* Multi-platform

# Setup
### IntelliJ IDEA and Java configuration
* Ensure your JAVA_HOME environment variable is exported in ~/.bash_profile
* Set project JDK to 1.8 in IntelliJ > Preferences > Build > Compiler > Java Compiler

### Android Studio
* Download Android Studio from https://developer.android.com/studio
* Default Android sdk path: /Users/$USER/Library/Android/sdk
  Edit ~/.bash_profile to export paths for sdk
  ```
  export ANDROID_HOME=/Users/$USER/Library/Android/sdk
  export PATH=${PATH}:$ANDROID_HOME/tools/bin:$ANDROID_HOME/platform-tools 
  ```
* Create the Android Emulator using Create Virtual Device
  
### Appium
Install appium using the folllowing command
```
npm install appium@next
  ```

Run Appium Driver. By default appium runs in port 4723
```
appium
  ```

### Run Tests
In IntelliJ, navigate to Run->Edit configurations.Select Junit. Select Module, ClassPath and add VM Options as below
```
-ea -Dplatform=android
  ```

### Author
Sushma Nagaraj




Note:
1. Tests are run to execute only on Android platform. It can be extended to use on iOS.
2. I found only android free apk called MyDemo android app.This is not a very stable app.

