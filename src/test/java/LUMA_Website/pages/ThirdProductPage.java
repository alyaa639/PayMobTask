package LUMA_Website.pages;

import org.openqa.selenium.By;

public class ThirdProductPage extends BasePage {
    private final By addToCompareButton = By.xpath("//span[contains(text(),'Add to Compare')]");
    private final By comparisonList = By.xpath("//a[contains(text(),'comparison list')]");

    public void clickOnAddToCompareButton(){
        scrollDownToElement(addToCompareButton);
        getWebElement(addToCompareButton).click();
    }
    public void clickOnComparisonListButton(){
        getWebElement(comparisonList).click();
    }
}
