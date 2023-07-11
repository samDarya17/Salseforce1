package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage extends BasePage{
    String fieldValue = "//span[text() = '%s']/ancestor::records-record-layout-item//span[contains(@class, 'field-value')] ";
    public static final By DETAILS_TITLE = By.xpath("//a[@data-label = 'Details']");
    public DetailsPage(WebDriver driver) {
        super(driver);
    }
    public String getFieldValue(String fielName){
        return driver.findElement(By.xpath(String.format(fieldValue, fielName))).getText();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_TITLE);
    }
}