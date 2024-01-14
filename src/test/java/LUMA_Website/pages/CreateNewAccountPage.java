package LUMA_Website.pages;

import org.openqa.selenium.By;

public class CreateNewAccountPage extends BasePage{

    private final By createNewAccountHeader= By.xpath("//span[contains(text(),'Create New Customer Account')]") ;
    private final By firstNameField = By.id("firstname") ;
    private final By lastNameField = By.id("lastname") ;
    private final By emailField = By.id("email_address") ;
    private final By passwordField = By.id("password") ;
    private final By confirmPasswordField = By.id("password-confirmation");
    private final By createAnAccountButton = By.xpath("//button[@title='Create an Account']");
    private final By confirmPasswordTitle =By.xpath("//span[contains(text(),'Confirm Password')]");
    public Boolean getCreateNewAccountHeader(){
      return getWebElement(createNewAccountHeader).isDisplayed() ;
    }
    public void enterFirstName(String firstaName){
        getWebElement(firstNameField).sendKeys(firstaName);
    }
    public void enterLastName(String lastName){
        getWebElement(lastNameField).sendKeys(lastName);
    }
    public void scrollDownToConfirmPasswordTitle(){
        scrollDownToElement(confirmPasswordTitle);
    }
    public void enterEmailInEmailField(String email){
        getWebElement(emailField).sendKeys(email);
    }
    public void enterPasswordInPasswordField(String password){
        getWebElement(passwordField).sendKeys(password);
    }
    public void enterPaawordInConfirmPasswordField(String password){
        getWebElement(confirmPasswordField).sendKeys(password);
    }

    public void clickOnCreateAnAccountButton(){
        getWebElement(createAnAccountButton).click();
    }

}
