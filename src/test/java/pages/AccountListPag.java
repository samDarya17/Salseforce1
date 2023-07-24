package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage{
    public static final By BREADCRUMB_LABEL = By.xpath(
            "//div[contains(@class, 'slds-breadcrumb')]//span[text() ='Accounts']");


    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public AccountListPage openAccountPage(){
        driver.get(BASE_URL + "lightning/o/Account/list");
        return this;
    }
    public AccountModalPage clickNewButton(){
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }
    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUMB_LABEL);
    }

}