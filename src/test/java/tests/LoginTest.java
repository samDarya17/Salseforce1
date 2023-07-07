

package tests;

        import org.testng.annotations.Test;
        import static org.testng.Assert.assertTrue;
        import pages.HomePage;


public class LoginTest extends BaseTest {
    @Test
    public void loginUserWithValidData() {
        boolean isHomePageOpened = loginPage.open()
                .login("dashikasam-rjq4@force.com","vara89083")
                .clickLoginButton()
                .isPageOpen();
        assertTrue(isHomePageOpened);

    }
}
