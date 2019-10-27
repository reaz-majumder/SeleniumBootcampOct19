package pages;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CitiBankHomePage extends CommonApi {

    @FindBy(xpath = "//a[@id='creditcards']")
    WebElement creditcards;

    @FindBy(xpath = "//a[@id='banking']")
    WebElement banking;

    @FindBy(xpath = "//a[@id='lending']")
    WebElement lending;

    @FindBy(xpath = "//a[@id='investing']")
    WebElement investing;

    @FindBy(xpath = "//a[@id='citiGold_Link']")
    WebElement citiGold;

    public void setCreditcards(){
        Assert.assertEquals(creditcards.isDisplayed(),true);
        Assert.assertEquals(creditcards.isEnabled(),true);
        creditcards.click();
    }

    public void setBanking(){
        Assert.assertEquals(banking.isDisplayed(),true);
        Assert.assertEquals(banking.isEnabled(),true);
        banking.click();
    }

    public void setLending(){
        Assert.assertEquals(lending.isDisplayed(),true);
        Assert.assertEquals(lending.isEnabled(),true);
        lending.click();
    }

    public void setInvesting(){
        Assert.assertEquals(investing.isDisplayed(),true);
        Assert.assertEquals(investing.isEnabled(),true);
        investing.click();
    }

    public void setCitiGold(){
        Assert.assertEquals(citiGold.isDisplayed(),true);
        Assert.assertEquals(citiGold.isEnabled(),true);
        citiGold.click();
    }


    public void navigationTabs(){
        //clickOnElementByXpath("//a[@id='banking']");

        //Initiate action class
        Actions actions = new Actions(driver);

        //Retrieve WebElement 'Banking Overview' to perform mouse hover
        WebElement bankingOptions = driver.findElement(By.xpath("//a[@id='bankingOverview_Link']"));
        actions.moveToElement(bankingOptions).perform();
        typeOnElementByXpath("//input[@name='zipcode']","90301");
        clickOnElementByXpath("//button[@class='btn btn-primary update-zipcode']");

    }












}
