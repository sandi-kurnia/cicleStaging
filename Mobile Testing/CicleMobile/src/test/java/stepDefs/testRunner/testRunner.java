package stepDefs.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/test12.json",
                "html:target/cucumber-reports/test13.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/Feature/checkin - delete comment",
        glue ={"stepDefs/checkinStepDef"},
        monochrome = true,
        dryRun = false,
        tags = "@Positive-Delete_Comment-02"
)

public class testRunner extends AbstractTestNGCucumberTests {
}
