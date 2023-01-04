package com.sandikurnia.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumbernegativeEditCheckin2.json",
                "html:target/cucumber-reports/negativeEditCheckin2Report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/Feature/checkin - cheers reply comment",
        glue = {"com/sandikurnia/stepDef"},
        monochrome = true,
        dryRun = false,
        tags = "@Negative-Give_Cheers_On_Reply_Comment-Feature"
)

public class testRunner extends AbstractTestNGCucumberTests {

}
