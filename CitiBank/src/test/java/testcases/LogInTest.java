package testcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.CitiBankLogIn;

public class LogInTest extends CitiBankLogIn {

    @Test @Ignore
    public void testLogin(){
        logIn();
    }
}
