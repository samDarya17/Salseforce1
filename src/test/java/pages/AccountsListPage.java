package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsListPage extends BasePage{

    public static final By BREADCRUM_LABEL = By.xpath("//div[contains(@class, 'slds-breadcrumb')]//span[text() ='Accounts'] ");

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }
    public AccountsModalPage clickNewButton(){
        driver.findElement(NEW_BUTTON).click();
        return new AccountsModalPage(driver);
    }
    public AccountsListPage open(){
        driver.get(URL + "lightning/o/Account/list");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUM_LABEL);
    }
}
