package MERCURY_DEMO_WEBSITE.tests.TestCases;

import MERCURY_DEMO_WEBSITE.tests.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class testCasesStepDefs extends BaseTest {
    @Given("open mercury demo website")
    public void openMercuryDemoWebsite() {
    }

    @When("click on accounts button on side menu")
    public void clickOnAccountsButtonOnSideMenu() {
        browser.landingPage.homePage.clickOnAccountsSnipper();
    }

    @And("click on credit card button in side menu")
    public void clickOnCreditCardButtonInSideMenu() {
        browser.landingPage.homePage.clickOnCreditCardButton();
    }

    @And("click on pay button in credit card page")
    public void clickOnPayButtonInCreditCardPage() {
        browser.landingPage.creditCard.ClickOnPayButton();
    }

    @And("click on review button in make a credit payment over relay in credit card page")
    public void clickOnReviewButtonInMakeACreditPaymentOverRelayInCreditCardPage() {
        browser.landingPage.creditCard.clickOnReviewButton();
    }

    @And("click on confirm payment button in make a credit payment over relay in credit card page")
    public void clickOnConfirmPaymentButtonInMakeACreditPaymentOverRelayInCreditCardPage() {
        browser.landingPage.creditCard.clickOnConfirmButton();
    }

    @Then("success message {string} should be displayed in make a credit payment over relay in credit card page")
    public void successMessageShouldBeDisplayedInMakeACreditPaymentOverRelayInCreditCardPage(String message) {
        Assert.assertEquals(browser.landingPage.creditCard.getpayentMessage(),message );

    }

    @When("click on all done button in make a credit payment over relay in credit card page")
    public void clickOnAllDoneButtonInMakeACreditPaymentOverRelayInCreditCardPage() {
        browser.landingPage.creditCard.clickOnAllDoneButton();
    }

    @And("click on done button")
    public void clickOnDoneButton() {
        browser.landingPage.creditCard.clickOnDoneButton();
    }

    @When("click on treasury button on side menu")
    public void clickOnTreasuryButtonOnSideMenu() {
        browser.landingPage.homePage.clickOnTreasuryButton();
    }

    @And("click on transfer funds spinner in transfer funds page")
    public void clickOnTransferFundsSpinnerInTransferFundsPage() {
        browser.landingPage.treasury.clickOnTransferSpinnerButton();
    }

    @And("click on transfer out funds in transfer funds page")
    public void clickOnTransferOutFundsInTransferFundsPage() {
        browser.landingPage.treasury.clickOnTransferOutButton();
    }

    @And("enter the amount {string} needed to transfer in transfer details page")
    public void enterTheAmountNeededToTransferInTransferDetailsPage(String amount) {
        browser.landingPage.transferBetweenAccounts.enterAmountInAmountField(amount);
    }

    @And("click on transfer to spinner in transfer details page")
    public void clickOnTransferToSpinnerInTransferDetailsPage() {
        browser.landingPage.transferBetweenAccounts.clickOnTransferToSpinner();
    }

    @And("click on next button in transfer details page")
    public void clickOnNextButtonInTransferDetailsPage() {
        browser.landingPage.transferBetweenAccounts.clickOnNextButton();
    }

    @And("click on transfer button in review transfer details page")
    public void clickOnTransferButtonInReviewTransferDetailsPage() throws InterruptedException {
        Thread.sleep(1000);
        browser.landingPage.reviewTransferDetails.clickOnTransferButton();
    }

    @Then("transfer message {string} appeared successfully")
    public void transferMessageAppearedSuccessfully(String message) {
        Assert.assertEquals(browser.landingPage.reviewTransferDetails.getSucessMessage(),message);
    }

    @And("select ops payroll option in transfer to dropdown menu in transfer details page")
    public void selectOpsPayrollOptionInTransferToDropdownMenuInTransferDetailsPage() {
        browser.landingPage.transferBetweenAccounts.clickOnOpsPayrollOption();
    }

    @And("error message {string} should be displayed")
    public void errorMessageShouldBeDisplayed(String message) {
        Assert.assertEquals( browser.landingPage.transferBetweenAccounts.getErrorMessage() ,message);


    }

    @And("select treasury option in transfer to dropdown menu in transfer details page")
    public void selectTreasuryOptionInTransferToDropdownMenuInTransferDetailsPage() {
        browser.landingPage.transferBetweenAccounts.clickOnTreasuryOption();
    }

    @Then("error message {string} indicates that amount more than the avilabe should be displayed")
    public void errorMessageIndicatesThatAmountMoreThanTheAvilabeShouldBeDisplayed(String message) throws InterruptedException {
        Thread.sleep(1000);
     Assert.assertEquals(browser.landingPage.transferBetweenAccounts.getErrorLimitMessage() , message);
    }

    @When("click on capital in side menu in home page")
    public void clickOnCapitalInSideMenuInHomePage() {
        browser.landingPage.homePage.clickOnCapitalButton();
    }

    @And("click on Venture Debt in capital page")
    public void clickOnVentureDebtInCapitalPage() {
        browser.landingPage.capital.clickOnVentureDebit();
    }

    @And("click on request fund button in capital page")
    public void clickOnRequestFundButtonInCapitalPage() {
        browser.landingPage.capital.clickOnRequestFund();
    }

    @And("enter the amount {string} you want to request in request fund page")
    public void enterTheAmountYouWantToRequestInRequestFundPage(String amount) {
        browser.landingPage.borrow.enterAmountToRquest(amount);
    }

    @And("click on next button in request fund page")
    public void clickOnNextButtonInRequestFundPage() {
        browser.landingPage.borrow.clickOnNextButton();
    }

    @And("click on next button in destination fund page")
    public void clickOnNextButtonInDestinationFundPage() {
        browser.landingPage.borrow.clickOnNextButton();
    }

    @And("click on request fund button in review page")
    public void clickOnRequestFundButtonInReviewPage() throws InterruptedException {
        Thread.sleep(1000);
        browser.landingPage.reviewFundRequest.clickOnRequestFundButton();
    }

    @And("click on agree button in review page")
    public void clickOnAgreeButtonInReviewPage() {
        browser.landingPage.reviewFundRequest.clickOnAgreeButton();
    }

    @And("success message {string} in Request done page should be displayed")
    public void successMessageInRequestDonePageShouldBeDisplayed(String message) {
        Assert.assertEquals( browser.landingPage.successFundRequest.getSuccessMessage() , message);
    }
}
