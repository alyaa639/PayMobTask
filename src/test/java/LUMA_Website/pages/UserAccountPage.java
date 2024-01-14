package LUMA_Website.pages;

import org.openqa.selenium.By;

public class UserAccountPage extends BasePage{
    private final By myAccountTitle = By.xpath("//span[contains(text(),'My Account')]") ;
    private final By homePageLogo =By.xpath("//a[@class='logo']");
    public boolean getMyAccountTittle() {
        return getWebElement(myAccountTitle).isDisplayed();
    }

    public void clickOnHomePageLogo(){
        getWebElement(homePageLogo).click();
    }
}
