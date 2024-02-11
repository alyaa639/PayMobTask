package MERCURY_DEMO_WEBSITE.platform;

import MERCURY_DEMO_WEBSITE.pages.*;

public class LandingPage {
    public ReviewFundRequest reviewFundRequest ;
    public SuccessFundRequest successFundRequest ;
    public Capital capital ;
    public Borrow borrow ;
     public ReviewTransferDetails reviewTransferDetails;
     public TransferBetweenAccounts transferBetweenAccounts;
    public Treasury treasury;
    public CreditCard creditCard;
    public HomePage homePage;


    public LandingPage() {
        reviewFundRequest = new ReviewFundRequest() ;
        successFundRequest = new SuccessFundRequest() ;
        capital = new Capital() ;
        borrow = new Borrow() ;
        transferBetweenAccounts = new TransferBetweenAccounts() ;
        reviewTransferDetails =new ReviewTransferDetails();
        treasury = new Treasury() ;
        creditCard = new CreditCard();
        homePage = new HomePage();

    }
}




