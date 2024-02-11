package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;

public class ReviewFundRequest extends BasePage{
    private final By requestFundButton = By.xpath("//div[contains(text(),'Request Funds')]") ;
    private final By agreeButton = By.xpath("//div[@class='styles__body-default-demi_EL7W8' and contains(text(),'Agree')]");

    public void clickOnRequestFundButton (){
        scrollDownToElement(requestFundButton);
        getWebElement(requestFundButton).click();
    }
    public void clickOnAgreeButton(){
        getWebElement(agreeButton).click();
    }
}
