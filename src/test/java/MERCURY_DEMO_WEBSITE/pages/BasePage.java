package MERCURY_DEMO_WEBSITE.pages;

import MERCURY_DEMO_WEBSITE.driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    public WebDriver edgeDriver = WebDriverSingleton.getWebDriver();
    public WebDriverWait wait = new WebDriverWait(edgeDriver, Duration.ofSeconds(30));
    JavascriptExecutor js = (JavascriptExecutor) edgeDriver;

    public WebElement getWebElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        wait.until(ExpectedConditions.visibilityOf(edgeDriver.findElement(locator)));
        return edgeDriver.findElement(locator);
    }
    public void scrollDownToElement(By locator ){

         WebElement Webelement =edgeDriver.findElement(locator);
         js.executeScript("arguments[0].scrollIntoView();", Webelement);

    }
    public void scrollUpToElement(By locator){
        edgeDriver.navigate().refresh();
        WebElement webElement= edgeDriver.findElement(locator) ;
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }

}
