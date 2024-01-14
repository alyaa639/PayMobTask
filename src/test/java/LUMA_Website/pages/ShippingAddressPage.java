package LUMA_Website.pages;

import org.openqa.selenium.By;

public class ShippingAddressPage extends BasePage{
    private final By adressField =By.xpath("//span[contains(text(),'Street Address')]//following::input[@class='input-text'][1]") ;
    private final By cityField = By.xpath("//span[contains(text(),'City')]//following::input[@class='input-text'][1]") ;
    private final By mobileNumberField = By.xpath("//span[contains(text(),'Phone Number')]//following::input[@class='input-text'][1]") ;
    private final By shippingMethodRadioButton = By.xpath("//input[@name='ko_unique_1']") ;
    private final By nextButton = By.xpath("//span[contains(text(),'Next')]");
    private final By stateDropDownMenu = By.xpath("//span[contains(text(),'State/Province')]//following::select[@name='region_id'][1]") ;
    private final By stateOption = By.xpath("//option[contains(text(),'Alabama')]");
    private final By postalCodeField = By.xpath("//span[contains(text(),'Zip/Postal Code')]//following::input[@class='input-text'][1]");
    public void enterAdressInAdressField(String address ){
        scrollDownToElement(adressField);
        getWebElement(adressField).sendKeys(address);
    }
    public void enterCityInCityField (String city){
        getWebElement(cityField).sendKeys(city);

    }
    public void enterMobileNumberInMobileNumberField(String mobileNumber){
        scrollDownToElement(mobileNumberField);
        getWebElement(mobileNumberField).sendKeys(mobileNumber );
    }
    public void clickOnShippingMethodRadioButton(){
        getWebElement(shippingMethodRadioButton).click();
    }
    public void  clickOnNextButton(){
        getWebElement(nextButton).click();
    }
    public void clickOnStateDropDownMenuSpinner(){
        getWebElement(stateDropDownMenu).click();
    }
    public void clickOnStateFromStatesDropDownMenu(){
        getWebElement(stateOption).click();
    }

    public void enterPostalCode(String code){
        getWebElement(postalCodeField).sendKeys(code);
    }

}
