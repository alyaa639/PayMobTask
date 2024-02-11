package MERCURY_DEMO_WEBSITE.tests;

import MERCURY_DEMO_WEBSITE.browser.Browser;
import MERCURY_DEMO_WEBSITE.driver.WebDriverSingleton;

import java.util.Properties;

public class BaseTest {

    protected WebDriverSingleton edgeDriver;
    protected static Browser browser = new Browser();
    protected static Properties properties;
    protected static Properties linksProperties;

    public BaseTest() {
        edgeDriver = WebDriverSingleton.getDriverSingleton();
    }
}
