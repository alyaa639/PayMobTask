package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;


public class SuccessFundRequest extends BasePage {
    private final By sucessMessage = By.xpath("//div[@class='styles__title-main_FJlXy styles__black_qQ9vk styles__header_kt43A']") ;


    public String getSuccessMessage(){
        return getWebElement(sucessMessage).getText();
    }
}
