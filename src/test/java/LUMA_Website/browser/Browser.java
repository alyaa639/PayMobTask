package LUMA_Website.browser;

import LUMA_Website.driver.WebDriverSingleton;
import LUMA_Website.platform.LandingPage;


public class Browser {

   private final WebDriverSingleton webDriverSingleton = WebDriverSingleton.getDriverSingleton();
    public LandingPage landingPage;

    public Browser() {
        landingPage = new LandingPage();
    }



}
