package LUMA_Website.pages;

import org.openqa.selenium.By;

public class ReviewAndPaymentsPage extends BasePage{
private final By placeOrderButton = By.xpath("//button[@class='action primary checkout']") ;
public void clickOnPlaceOrderButton(){
    scrollDownToElement(placeOrderButton);
    getWebElement(placeOrderButton).click();
}
}
