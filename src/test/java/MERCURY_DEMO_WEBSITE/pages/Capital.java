package MERCURY_DEMO_WEBSITE.pages;

import org.openqa.selenium.By;

public class Capital extends BasePage{
    private final By ventureDebit = By.xpath("//div[contains(text(),'Venture Debt')]") ;
    private final By requestFund = By.xpath("//div[contains(text(),'Request Funds')]") ;

    public void clickOnVentureDebit(){
        getWebElement(ventureDebit).click();
    }
    public void clickOnRequestFund(){
        getWebElement(requestFund).click();
    }
}
