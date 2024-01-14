package LUMA_Website.pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage {

    private final By hotSellersTitle = By.xpath("//h2[contains(text(),'Hot Sellers')]");
    private final By secondProduct = By.xpath("//img[@alt='Breathe-Easy Tank']");
    private final By thirdProduct = By.xpath("//img[@alt='Argus All-Weather Tank']");
    public void scrollDownToHotSellersSectio() {
       scrollDownToElement(hotSellersTitle);
    }
    public void clickOnSecondProduct(){
        getWebElement(secondProduct).click();
    }
    public void  clickOnThirdProduct(){
        getWebElement(thirdProduct).click();
    }


}
