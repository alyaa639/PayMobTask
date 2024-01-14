package LUMA_Website.tests;

import LUMA_Website.browser.Browser;
import LUMA_Website.driver.WebDriverSingleton;

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
