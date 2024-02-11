package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;

public class ReviewTransferDetails extends BasePage{
    private final By transferButton = By.xpath("//div[@class='styles__body-default-demi_EL7W8' and contains(text(),'Transfer')]") ;
    private final By transferMessage = By.xpath("//h1[@class='styles__title-hero_myZaG styles__black_qQ9vk styles__heading_emMfc']") ;
    public void clickOnTransferButton(){
        scrollDownToElement(transferButton);
        getWebElement(transferButton).click();
    }
    public String getSucessMessage(){
       return getWebElement(transferMessage).getText();
    }

}
