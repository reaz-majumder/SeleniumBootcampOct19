package pages;

import base.CommonApi;

public class CitiBankLogIn extends CommonApi {

    public void logIn(){
        typeOnElementByXpath("//input[@id='username']","username");
        typeOnElementByXpath("//input[@id='password']","password");
        clickOnElementByXpath("//input[@id='signInBtn']");
    }

}
