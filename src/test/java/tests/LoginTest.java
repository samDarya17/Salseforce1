package tests;

import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {


    @Test(description = "Проверка логина с валидными данными")
    public void loginUserIsValidData(){
        boolean isHomePageOpen = loginPage.openSaleForce()
                .loginAndPassword("dashikasam-rjq4@force.com", "vara89083")
                .clickLogInButton()
                .isPageOpen();
        assertTrue(isHomePageOpen);
    }
}
