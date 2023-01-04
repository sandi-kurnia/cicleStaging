package stepDefs.boardStepDef;

import com.sandikurnia.base.testBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.Setting;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class boardStepdefs extends testBase {


    @Given("User open staging-cicle on mobile")
    public void userOpenStagingCicleOnMobile() throws Exception {

        capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Pixel 3");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");
        capabilities.setCapability("noReset", true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 100);

    }

    @When("User Tap on Sekolah QA in Team menu")
    public void userTapOnSekolahQAInTeamMenu() throws Exception{
        Thread.sleep(3000);
        MobileElement TapSekolaQA = driver.findElementByAccessibilityId("Div Cilsy\n" +
                "For Testing");
        TapSekolaQA.click();
    }

    @And("User Tap on Board menu")
    public void userTapOnBoardMenu() throws Exception {

        Thread.sleep(3000);
        MobileElement TapBoardMenu = driver.findElementByAccessibilityId("Board");
        TapBoardMenu.click();

    }

    @Then("user can see inside Board menu")
    public void userCanSeeInsideBoardMenu() throws Exception {

        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByAccessibilityId("Board").isDisplayed());
    }
}
