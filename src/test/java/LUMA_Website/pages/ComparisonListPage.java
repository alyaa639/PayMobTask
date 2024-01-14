package LUMA_Website.pages;

import org.openqa.selenium.By;

public class ComparisonListPage extends BasePage{
    private final By addToCartSecondItemButton= By.xpath("//span[contains(text(),'$34.00')]//following::span[contains(text(),'Add to Cart')]") ;

    public void clickOnAddToCartButton(){
        scrollDownToElement(addToCartSecondItemButton);
        getWebElement(addToCartSecondItemButton).click();
    }
}
