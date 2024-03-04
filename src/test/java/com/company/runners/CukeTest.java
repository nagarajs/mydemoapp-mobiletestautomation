package com.company.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "json:build/reports/tests/cucumber-extent/cucumber_report.json"
        },
        stepNotifications = true,
        features = {
                "src/test/java/com/company/tests"
        },
        tags = "@done",
        glue = {
                "com.company.steps",
                "com.company.utilities"
        })
public class CukeTest {
}
