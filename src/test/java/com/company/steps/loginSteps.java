package com.company.steps;

import com.beust.jcommander.internal.Nullable;
import com.company.contracts.Login;
import com.company.contracts.Menu;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java8.En;

import static com.company.mydriver.AndroidMobileDriver.buildAndroidDriver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class loginSteps implements En {

    @Inject
    public loginSteps(Menu menu, Login login) {

        Then("^the customer is navigated to Login Screen$",menu::goToLogin);

        Then("^the customer enter the username as (.*_*) and password as (.*_*)$",
                (String username, String password) -> {
                login.login(username, password);
                });

        Then("^the customer must be logged in successfully$",
                () -> {
                    Boolean expected = true;
                    Boolean actual =  login.verifyOnProductPage();
                    String reasonForFailure = "Login Unsuccessful";
                    assertThat(reasonForFailure, expected, equalTo(actual));

                });

        Then("^the customer gets an login error message$",
                () -> {
                    String expected = "Sorry, this user has been locked out.";;
                    String actual =  login.getErrorMessage();
                    String reasonForFailure = "Error message not displayed";
                    assertThat(reasonForFailure, expected, equalTo(actual));
                });

        Then("^scroll the Products$",
                () -> {

                });



    }
}

