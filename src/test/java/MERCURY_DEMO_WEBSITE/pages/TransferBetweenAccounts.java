package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;

public class TransferBetweenAccounts extends BasePage{
    private final By amountField = By.xpath("//input[@class='styles__input_KowZJ styles__xlarge_LXVqg styles__amountFieldInputEmpty_hEZXh styles__input_l2xgd']") ;
private final By tarnsferToSpinner = By.xpath("//span[@id='toAccountTPId']") ;
private final By opsPayrollOption = By.xpath("//div[@title='Ops / Payroll']") ;
private  final By nextButton =  By.xpath("//div[@class='styles__body-default-demi_EL7W8' and contains(text(),'Next')]") ;
private final By treasuryOption = By.xpath("//div[@class='styles__topRow_GcO2a']//following::div[@title='Treasury']") ;
private final By errorMessage = By.xpath("//span[@class='styles__tiny_kCP28 styles__text-error_y9_YF styles__defaultErrorMessage_XKfnw']") ;
private final By limitErrorMessagen = By.xpath("//span[contains(text(),'This account does not have enough funds.')]") ;

    public void enterAmountInAmountField(String amount){
        getWebElement(amountField).sendKeys(amount);
    }
    public void clickOnTransferToSpinner(){
        scrollDownToElement(tarnsferToSpinner);
        getWebElement(tarnsferToSpinner).click();
    }
    public void clickOnOpsPayrollOption(){
        scrollDownToElement(opsPayrollOption);
        getWebElement(opsPayrollOption).click();
    }
    public void clickOnNextButton(){
        scrollDownToElement(nextButton);
        getWebElement(nextButton).click();
    }
    public void clickOnTreasuryOption(){
        scrollDownToElement(treasuryOption);
        getWebElement(treasuryOption).click();
    }
    public String getErrorMessage(){
        scrollDownToElement(errorMessage);
    return  getWebElement(errorMessage).getText();

    }
    public String getErrorLimitMessage(){
        return getWebElement(limitErrorMessagen).getText() ;
    }
}
