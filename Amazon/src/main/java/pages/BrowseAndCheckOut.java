package pages;


import base.CommonApi;

public class BrowseAndCheckOut extends CommonApi {
    public void validateSearch(){
        driver.navigate().to("https://www.amazon.com/?ref_=nav_signin&");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']","selenium books");
    }
    public void validateSubmitSearch(){
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
    }
    public void validateSearchResult(){
        isElementDisplayed("//a[@class='nav-imageHref']//img");
    }
    public void validateProducts(){
        clickOnElementByXpath("//span[contains(text(),'Test Automation using Selenium WebDriver with Java')]");
    }
    public void validateShoppingCart(){
        clickOnElementByXpath("//input[@id='add-to-cart-button']");
        driver.navigate().to("https://www.amazon.com");
    }
}