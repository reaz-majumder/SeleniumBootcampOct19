package testCases;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.AmazonHomePage;

public class HomePageTest extends CommonApi {
    AmazonHomePage homePage;
    @BeforeMethod
    public void setHomePage(){
        homePage= PageFactory.initElements(driver,AmazonHomePage.class);
    }
    @Test @Ignore
    public void testOnHomepage(){
        homePage.validateHomePage();
    }
    @Test @Ignore
    public void testONaccountList(){
        homePage.validateAccountList();
    }
    @Test @Ignore
    public void validateSignIN(){
        homePage.signIn();
    }
}
