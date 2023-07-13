package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public static final By HOME_LINK = By.xpath("//span[text() = 'Home']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(HOME_LINK);
    }
    public HomePage openHomePage() {
        driver.get(URL + "lightning/page/home");
        return this;
    }
}
