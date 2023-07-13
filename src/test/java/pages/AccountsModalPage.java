package pages;

import elements.DropDown;
import elements.Input;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsModalPage extends BasePage{

    public static final By NEW_ACCOUNT_TITLE = By.xpath("//h2[contains(@class, 'inlineTitle')] ");
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");

    String inputLocator = "//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";



    public AccountsModalPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isPageOpen() {
        return isExist(NEW_ACCOUNT_TITLE);
    }
    public AccountsModalPage openModalPage() {
        driver.get(URL + "lightning/o/Account/new");
        return this;
    }
    public DetailsPage create(Account account){

        new Input(driver,"Account Name").write(account.getAccountName());
        new Input(driver,"Website").write(account.getWebSite());
        new DropDown(driver,"Type").selectOption(account.getType());
        new Input(driver,"Phone").write(account.getPhone());
        new Input(driver,"Fax").write(account.getFax());
        return clickSaveButton();


            }
    public DetailsPage clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
        return new DetailsPage(driver);
    }





}
