package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void loginUserIsValidData(){
        boolean isHomePageOpen = loginPage.openSaleForce()
                .loginAndPassword("dashikasam-rjq4@force.com", "vara89083")
                .clickLogInButton()
                .isPageOpen();
        assertTrue(isHomePageOpen);
    }
}
