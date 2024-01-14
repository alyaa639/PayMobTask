package LUMA_Website.pages;

import org.openqa.selenium.By;

public class SecondProductPage extends BasePage {

    private final By addToCompareButton = By.xpath("//span[contains(text(),'Add to Compare')]");
    private final By homePageLogo = By.xpath("//a[@class='logo']");
    private final By smallSizeButton = By.id("option-label-size-143-item-167") ;
    private final By whiteColorButton = By.id("option-label-color-93-item-59") ;
    private final By addToCartButton = By.xpath("//button[@id='product-addtocart-button']") ;
    private final By shoppingCartButton = By.xpath("//span[@class='counter-number']");
    private final By proceedToCheckOutButton = By.id("top-cart-btn-checkout");

    public void clickOnAddToCompareButton(){
        scrollDownToElement(addToCompareButton);
        getWebElement(addToCompareButton).click();
    }
    public void clickOnHomePageLogo(){
        getWebElement(homePageLogo).click();
    }
    public void clickOnWhiteColorButton(){
        getWebElement(whiteColorButton).click();
    }
    public void clickOnSmallSizeButton(){
        getWebElement(smallSizeButton).click();
    }
    public void clickOnAddToCartButton() {
        scrollDownToElement(addToCartButton);
        getWebElement(addToCartButton).click();
    }
    public void clickOnShoppingCartButton() throws InterruptedException {
        Thread.sleep(1000);
        scrollUpToElement(shoppingCartButton);
        getWebElement(shoppingCartButton).click();
    }
    public void clickOnProceedToCheckOut(){
        getWebElement(proceedToCheckOutButton).click();
    }

}
