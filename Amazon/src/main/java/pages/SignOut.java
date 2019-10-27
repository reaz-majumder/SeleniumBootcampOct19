package pages;

import base.CommonApi;

public class SignOut extends CommonApi {
    AmazonLogInPage loginPage= new AmazonLogInPage();
    AmazonHomePage homePage= new AmazonHomePage();
    public void validateSignOut(){
        homePage.signIn();
        loginPage.validateLoginField("username");
        loginPage.continueButton();
        loginPage.validatePasswordField("password");
        loginPage.clickOnSignInButton();
        clickOnElementByXpath("//a[@id='nav-link-accountList']");
        clickOnElementByXpath("//a[@id='nav-item-signout']");
    }
}
