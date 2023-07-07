package pages;

import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsModalPage extends BasePage{



    public AccountsModalPage(WebDriver driver) {
        super(driver);
    }
    public void create(String accountName,String webSite){
//        driver.findElement(By.xpath(String.format(inputLocator,"Account Name"))).sendKeys(accountName);
//        driver.findElement(By.xpath(String.format(inputLocator,"Website"))).sendKeys(webSite);
        new Input(driver,"Account Name").write("NewName");
        new Input(driver,"Website").write("www.onliner.by");


            }
    public static final By NEW_ACCOUNT_TITLE = By.xpath("//h2[contains(@class, 'inlineTitle')] ");


    @Override
    public boolean isPageOpen() {
        return isExist(NEW_ACCOUNT_TITLE);
    }
}
