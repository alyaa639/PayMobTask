package LUMA_Website.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverSingleton {

    private static WebDriver webDriver;
    private static WebDriverSingleton webDriverSingleton = null;
    private WebDriverSingleton() {
        setDriverCapabilities();
    }

    public static WebDriverSingleton getDriverSingleton() {
        if (webDriverSingleton == null)
            webDriverSingleton = new WebDriverSingleton();
        return webDriverSingleton;
    }

    private void setDriverCapabilities() {
        webDriver = new EdgeDriver();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }

    public void resetCache() throws InterruptedException {
        webDriver.manage().deleteAllCookies();
    }

    public static void close() {
        webDriver.close();
    }
    public static void quit(){
        webDriver.quit();
    }

    public static void maximizeTheWindow() {
        webDriver.manage().window().maximize();
    }
}
