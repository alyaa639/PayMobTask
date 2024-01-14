package LUMA_Website.pages;

import org.openqa.selenium.By;

public class IntroPage extends BasePage{
    private final By createAnAccountButton = By.xpath("//a[contains(text(),'Create an Account')]");
    public void clickOnCreateAnAccountButton(){
      getWebElement(createAnAccountButton).click();
    }

}
