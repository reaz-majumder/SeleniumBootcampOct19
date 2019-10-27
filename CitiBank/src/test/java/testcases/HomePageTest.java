package testcases;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.CitiBankHomePage;

public class HomePageTest extends CommonApi {
    CitiBankHomePage homePage;

    @BeforeMethod
    public void setCitiBankHomePage(){
        homePage = PageFactory.initElements(driver,CitiBankHomePage.class);
    }

    public void testCreditCrads(){
        homePage.setCreditcards();
    }

    public void testBanking(){
        homePage.setBanking();
    }

    public void testLending(){
        homePage.setLending();
    }

    public void testInvesting(){
        homePage.setInvesting();
    }

    public void testCitiGold(){
        homePage.setCitiGold();
    }
}
