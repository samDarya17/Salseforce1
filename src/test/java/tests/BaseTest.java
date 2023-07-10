package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    LoginPage loginPage;
    HomePage homePage;
    AccountsListPage accountsListPage;
    AccountsModalPage accountsModalPage;
    DetailsPage detailsPage;



    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        accountsListPage = new AccountsListPage(driver);
        accountsModalPage = new AccountsModalPage(driver);
        detailsPage = new DetailsPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        driver.quit();
    }
}