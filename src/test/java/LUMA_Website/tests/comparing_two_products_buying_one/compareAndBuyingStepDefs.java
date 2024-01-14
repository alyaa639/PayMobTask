package LUMA_Website.tests.comparing_two_products_buying_one;

import LUMA_Website.tests.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class compareAndBuyingStepDefs extends BaseTest {
    @When("click on luma home page in welcome page")
    public void clickOnLumaHomePageInWelcomePage() {
        browser.landingPage.userAccountPage.clickOnHomePageLogo();

    }

    @When("scroll down to hot sellers section in home page")
    public void scrollDownToHotSellersSectionInHomePage() {
        browser.landingPage.homePage.scrollDownToHotSellersSectio();
    }

    @When("click on comparison list button in home page")
    public void clickOnComparisonListButtonInHomePage() {
    }

    @When("click on add to cart of the second product in comparison page")
    public void clickOnAddToCartOfTheSecondProductInComparisonPage() {
        browser.landingPage.comparisonListPage.clickOnAddToCartButton();
    }

    @When("select the white color in the second product page")
    public void selectTheWhiteColorInTheSecondProductPage() {
        browser.landingPage.secondProductPage.clickOnWhiteColorButton();
    }

    @When("select the small size in the second product page")
    public void selectTheSmallSizeInTheSecondProductPage() {
        browser.landingPage.secondProductPage.clickOnSmallSizeButton();
    }

    @When("click on add to cart button second product page")
    public void clickOnAddToCartButtonSecondProductPage() {
        browser.landingPage.secondProductPage.clickOnAddToCartButton();
    }

    @When("click on cart button in second product page")
    public void clickOnCartButtonInSecondProductPage() throws InterruptedException {

        browser.landingPage.secondProductPage.clickOnShoppingCartButton();
    }

    @When("click on proceed to check out button in second product page")
    public void clickOnProceedToCheckOutButtonInSecondProductPage() {
        browser.landingPage.secondProductPage.clickOnProceedToCheckOut();
    }



    @When("enter shipping address {string} in shipping address field in shipping page")
    public void enterShippingAddressInShippingAddressFieldInShippingPage(String address) throws InterruptedException {
        Thread.sleep(3000);
        browser.landingPage.shippingAddressPage.enterAdressInAdressField(address);
    }

    @When("enter postal code {string} in postal code field in shipping page")
    public void enterPostalCodeInPostalCodeFieldInShippingPage(String code) {
        browser.landingPage.shippingAddressPage.enterPostalCode(code);

    }

    @When("click on next button in shipping page")
    public void clickOnNextButtonInShippingPage() {
        browser.landingPage.shippingAddressPage.clickOnNextButton();
    }

    @When("click on place order button in review and payments page")
    public void clickOnPlaceOrderButtonInReviewAndPaymentsPage() throws InterruptedException {
        Thread.sleep(3000);
        browser.landingPage.reviewAndPaymentsPage.clickOnPlaceOrderButton();
    }

    @Then("success message should be {string}")
    public void successMessageShouldBe(String message) {
       Assert.assertEquals(browser.landingPage.orderCompletedPage.getThanksMessage(),message);
    }

    @When("click on the second product in hot sellers section in home page")
    public void clickOnTheSecondProductInHotSellersSectionInHomePage() {
        browser.landingPage.homePage.clickOnSecondProduct();
    }

    @When("click on add product to comparison in second product page")
    public void clickOnAddProductToComparisonInSecondProductPage() {
        browser.landingPage.secondProductPage.clickOnAddToCompareButton();
    }

    @When("click home button in second product page")
    public void clickHomeButtonInSecondProductPage() {
        browser.landingPage.secondProductPage.clickOnHomePageLogo();
    }

    @When("click on the third product in hot sellers section in home page")
    public void clickOnTheThirdProductInHotSellersSectionInHomePage() {
        browser.landingPage.homePage.clickOnThirdProduct();
    }

    @When("click on add product to comparison in third product page")
    public void clickOnAddProductToComparisonInThirdProductPage() {
        browser.landingPage.thirdProductPage.clickOnAddToCompareButton();
    }


    @When("click on comparison list button in third product page")
    public void clickOnComparisonListButtonInThirdProductPage() {
        browser.landingPage.thirdProductPage.clickOnComparisonListButton();
    }

    @When("enter phone number{string} in phone number filed in shipping page")
    public void enterPhoneNumberInPhoneNumberFiledInShippingPage(String mobileNumber) {
        browser.landingPage.shippingAddressPage.enterMobileNumberInMobileNumberField(mobileNumber);
    }

    @When("enter city {string} in city field in shipping page")
    public void enterCityInCityFieldInShippingPage(String city) {
        browser.landingPage.shippingAddressPage.enterCityInCityField(city);
    }

    @When("select the state from the state drop down menu in shipping page")
    public void selectTheStateFromTheStateDropDownMenuInShippingPage() {
        browser.landingPage.shippingAddressPage.clickOnStateDropDownMenuSpinner();
        browser.landingPage.shippingAddressPage.clickOnStateFromStatesDropDownMenu();
    }

    @When("click on shipping rate radio button")
    public void clickOnShippingRateRadioButton() {
        browser.landingPage.shippingAddressPage.clickOnShippingMethodRadioButton();
    }
}
