package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage extends BasePage{
    public static final By DETAILS_TITLE =By.xpath("//a[@data-label ='Details']");
    public DetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_TITLE);
    }
}