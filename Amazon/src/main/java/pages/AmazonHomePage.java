package pages;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazonHomePage extends CommonApi {

    @FindBy(linkText = "AmazonBasics")
    WebElement amazonBasics;
    @FindBy(xpath = "//span[@class='nav-line-2 nav-long-width']")
    WebElement accountList;

    public void validateHomePage(){
        Assert.assertEquals(amazonBasics.isDisplayed(),true,"amazonBasics is not displayed");
    }
    public void validateAccountList(){
        accountList.click();
    }
    public void signIn(){
        clickOnElementByXpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]");
    }
}
