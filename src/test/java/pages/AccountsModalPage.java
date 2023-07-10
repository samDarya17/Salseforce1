package pages;

import elements.Input;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsModalPage extends BasePage{

    public static final By NEW_ACCOUNT_TITLE = By.xpath("//h2[contains(@class, 'inlineTitle')] ");
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");



    public AccountsModalPage(WebDriver driver) {
        super(driver);
    }
    public void create(Account account){

        new Input(driver,"Account Name").write(account.getAccountName());
        new Input(driver,"Website").write(account.getWebsite());


            }
    public DetailsPage clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
        return new DetailsPage(driver);
    }



    @Override
    public boolean isPageOpen() {
        return isExist(NEW_ACCOUNT_TITLE);
    }
}
