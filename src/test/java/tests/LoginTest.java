package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest{
    @Test
    public void logiUserValidData(){
        loginPage.open();
        loginPage.loginReg("obepgu-3c6t@force.com","vara89083");
        Assert.assertTrue(homePage.isPageOpen());

    }
}
