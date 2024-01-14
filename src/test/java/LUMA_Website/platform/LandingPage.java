package LUMA_Website.platform;

import LUMA_Website.pages.*;

public class LandingPage {

    public HomePage homePage;
    public IntroPage introPage;
    public UserAccountPage userAccountPage;
    public CreateNewAccountPage createNewAccountPage;
    public ComparisonListPage comparisonListPage;
    public OrderCompletedPage orderCompletedPage ;
    public ReviewAndPaymentsPage reviewAndPaymentsPage;
    public SecondProductPage secondProductPage;
    public ShippingAddressPage shippingAddressPage;
    public ThirdProductPage thirdProductPage;


    public LandingPage() {
        homePage = new HomePage();
        introPage = new IntroPage() ;
        userAccountPage = new UserAccountPage();
        createNewAccountPage = new CreateNewAccountPage();
        comparisonListPage = new ComparisonListPage();
        orderCompletedPage = new OrderCompletedPage();
        reviewAndPaymentsPage = new ReviewAndPaymentsPage();
        secondProductPage = new SecondProductPage();
        shippingAddressPage = new ShippingAddressPage();
        thirdProductPage = new ThirdProductPage();
    }
}




