package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage {

    private final By accountsButton = By.linkText("Accounts");
    private final By creditCard= By.xpath("//a[contains(text(),'Credit Card')]") ;
    private final By treasury=By.xpath("//div[contains(text(),'Treasury')]") ;
    private final By capital = By.xpath("//div[contains(text(),'Capital')]") ;

public void clickOnAccountsSnipper(){
    getWebElement(accountsButton).click();
}
public void clickOnCreditCardButton(){
    getWebElement(creditCard).click();
}
public void clickOnTreasuryButton(){
    getWebElement(treasury).click();
}
    public void clickOnCapitalButton(){
        getWebElement(capital).click();
    }
}
