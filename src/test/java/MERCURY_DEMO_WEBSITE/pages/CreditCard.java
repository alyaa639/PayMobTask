package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;

public class CreditCard extends BasePage{private final By donen=By.xpath("//div[contains(text(),'Done')]");
    private final By payButton= By.xpath("//span[@class='styles__body-default_BZuS2 styles__white_eOhCL']");
    private final By reviewButton= By.xpath("//div[@class='styles__body-default-demi_EL7W8' and contains(text(),'Review')]") ;
    private final By confirmButton=By.xpath("//div[@class='styles__body-default-demi_EL7W8' and contains(text(),'Confirm Payment')]");
    private final By paymentMessage=By.xpath("//div[contains(text(),'Payment applied')]");
private final By allDoneButton=By.xpath("//div[contains(text(),'All Done')]");
public void ClickOnPayButton(){
getWebElement(payButton).click();}
public void clickOnReviewButton(){
getWebElement(reviewButton).click();}
public void clickOnConfirmButton(){
getWebElement(confirmButton).click(); }
public String getpayentMessage(){return getWebElement(paymentMessage).getText();}
public void clickOnAllDoneButton(){
getWebElement(allDoneButton).click();}
public void clickOnDoneButton(){
getWebElement(donen).click();}
}