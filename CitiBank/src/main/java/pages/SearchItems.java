package pages;

import base.CommonApi;

public class SearchItems extends CommonApi {

    public void search(){
        clickOnElementByXpath("//div[@id='personetics-citi-menu']");
        typeOnElementByXpath("//input[@id='citi-autocomplete-content-searchbox-livesearch']","what is fico?");
        clickOnElementByXpath("//button[@class='citi-autocomplete-content-searchbox-go']");
    }
}
