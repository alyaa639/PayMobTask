package LUMA_Website.tests.creating_new_account;

import LUMA_Website.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class newAccountStepDefs extends BaseTest {
    @Given("luma website opened successfully")
    public void lumaWebsiteOpenedSuccessfully() {
    }

    @When("click on create new account button in landing page")
    public void clickOnCreateNewAccountButtonInLandingPage() {
    browser.landingPage.introPage.clickOnCreateAnAccountButton();

    }

    @Then("create new account page should be displayed")
    public void createNewAccountPageShouldBeDisplayed() {
      Assert.assertTrue(browser.landingPage.createNewAccountPage.getCreateNewAccountHeader());
    }

    @When("enter first {string} name in create new customer account page")
    public void enterFirstNameInCreateNewCustomerAccountPage(String firstName) {
        browser.landingPage.createNewAccountPage.enterFirstName(firstName);
    }

    @When("enter last name {string} in create new customer account page")
    public void enterLastNameInCreateNewCustomerAccountPage(String lastName) {
        browser.landingPage.createNewAccountPage.enterLastName(lastName);
    }

    @When("scroll down to confirm password filed")
    public void scrollDownToConfirmPasswordFiled() {
        browser.landingPage.createNewAccountPage.scrollDownToConfirmPasswordTitle();
    }

    @When("enter your email {string} in create new customer account page")
    public void enterYourEmailInCreateNewCustomerAccountPage(String email) {
        browser.landingPage.createNewAccountPage.enterEmailInEmailField(email);
    }

    @When("enter password {string} in create new customer account page")
    public void enterPasswordInCreateNewCustomerAccountPage(String pass) {
        browser.landingPage.createNewAccountPage.enterPasswordInPasswordField(pass);
    }

    @When("reenter the password {string} in create new customer account page")
    public void reenterThePasswordInCreateNewCustomerAccountPage(String pass) {
        browser.landingPage.createNewAccountPage.enterPaawordInConfirmPasswordField(pass);
    }

    @When("click on create an account button in create new customer account page")
    public void clickOnCreateAnAccountButtonInCreateNewCustomerAccountPage() {
        browser.landingPage.createNewAccountPage.clickOnCreateAnAccountButton();
    }

    @Then("home page should be displayed")
    public void homePageShouldBeDisplayed() {
        browser.landingPage.userAccountPage.getMyAccountTittle();
    }

}
