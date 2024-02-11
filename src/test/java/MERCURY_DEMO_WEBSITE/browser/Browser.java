package MERCURY_DEMO_WEBSITE.browser;

import MERCURY_DEMO_WEBSITE.driver.WebDriverSingleton;
import MERCURY_DEMO_WEBSITE.platform.LandingPage;


public class Browser {

   private final WebDriverSingleton webDriverSingleton = WebDriverSingleton.getDriverSingleton();
    public LandingPage landingPage;

    public Browser() {
        landingPage = new LandingPage();
    }



}
