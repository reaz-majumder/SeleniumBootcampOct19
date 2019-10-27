package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.BrowseAndCheckOut;

public class BrowseAndCheckoutTest extends BrowseAndCheckOut {
    @Test @Ignore
    public void testBrowsingProducts(){
        validateSearch();
        validateSubmitSearch();
        sleepFor(5);
        validateSearchResult();
        validateProducts();
        validateShoppingCart();
    }
}
