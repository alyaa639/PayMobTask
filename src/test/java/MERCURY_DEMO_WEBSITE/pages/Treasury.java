package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;

public class Treasury extends BasePage{
    private final By transferSpinner = By.xpath("//button[@class='styles__dropdownButton_zm62M']") ;
    private final By transferOutOption = By.xpath("//span[contains(text(),'Transfer Out')]");
    public void clickOnTransferSpinnerButton(){
        getWebElement(transferSpinner).click();
    }
    public void clickOnTransferOutButton(){
        getWebElement(transferOutOption).click();
    }
}
