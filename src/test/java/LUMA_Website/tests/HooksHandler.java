package LUMA_Website.tests;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import LUMA_Website.driver.WebDriverSingleton;
import LUMA_Website.properties_reading.ReadPropertiesFile;
import LUMA_Website.utilities.extent_report.ExtentReport;
import LUMA_Website.utilities.extent_report.Screenshot;

import java.io.IOException;

public class HooksHandler extends BaseTest {
    String LumaWebsiteLink;

    @Before(order = 1)
    public void setUpJawwyLink() throws IOException {
        edgeDriver = WebDriverSingleton.getDriverSingleton();
        linksProperties = ReadPropertiesFile.setUrlsProperties();
        LumaWebsiteLink = linksProperties.getProperty("LumaWebsiteLink");
        edgeDriver.navigateTo(LumaWebsiteLink);

        WebDriverSingleton.maximizeTheWindow();
    }
    @Before(value = "@Subscription", order = 1)
    public void startTCHooks(Scenario scenario) {
        ExtentReport.setScenario(scenario);
        ExtentReport.startTC();
    }
    @Before(value = "@Subscription", order = 2)
    public void setStepDefs() throws NoSuchFieldException, IllegalAccessException {
        ExtentReport.setStepDefs();
    }
    @AfterStep(value = "@Subscription")
    public void
    afterStep(Scenario scenario) {
        String stepName = ExtentReport.getCurrentStepName();
        Status logStatus;

        if (scenario.isFailed()) {
            logStatus = Status.FAIL;
            String base64Screenshot = Screenshot.getScreenShot();
            ExtentReport.getTest().log(logStatus, stepName, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
        }
        else {
            logStatus = Status.PASS;
            ExtentReport.getTest().log(logStatus,stepName);
        }
    }
    @After(value = "@Subscription", order = 1)
    public void endTC() {
        if (ExtentReport.isCurrentlyUsingReport()) {
            ExtentReport.getExtent().flush();
        }
    }

    @After(value = "@Subscription", order = 0)
    public void tearDownSiebel() throws InterruptedException {
        edgeDriver.resetCache();
        closeWebDriverAfterAllTestsHook();
    }

    private void closeWebDriverAfterAllTestsHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> { WebDriverSingleton.close(); }));
    }
}
