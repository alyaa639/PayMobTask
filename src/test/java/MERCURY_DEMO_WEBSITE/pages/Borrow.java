package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;

public class Borrow extends BasePage{
    private final By amountInputField = By.xpath("//input[@class='styles__input_KowZJ styles__xlarge_LXVqg styles__amountFieldInputEmpty_hEZXh styles__input_l2xgd']") ;
    private final By nextButton = By.xpath("//div[contains(text(),'Next')]") ;


    public void enterAmountToRquest(String amount ){
        getWebElement(amountInputField).sendKeys(amount);
    }
    public void clickOnNextButton(){
        scrollDownToElement(nextButton);
        getWebElement(nextButton).click();
    }
}
