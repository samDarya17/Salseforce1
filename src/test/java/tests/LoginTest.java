package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest{
    @Test
    public void loginUserValidData(){
        boolean isHomePageOpened = loginPage.open()
                .login("dashikasam-rjq4@force.com","vara89083")
                        .clikLoginButton()
                                .isPageOpen();
        Assert.assertTrue(isHomePageOpened);

    }
}
