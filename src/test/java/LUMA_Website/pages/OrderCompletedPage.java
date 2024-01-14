package LUMA_Website.pages;

import org.openqa.selenium.By;

public class OrderCompletedPage extends BasePage {
    private final By thaksMessage = By.xpath("//span[contains(text(),'Thank you for your purchase!')]");


    public String getThanksMessage() {
       return getWebElement(thaksMessage).getText();
    }
}
