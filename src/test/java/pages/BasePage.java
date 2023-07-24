package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public static final String BASE_URL = "https://ap12.lightning.force.com/";
    public static final By NEW_BUTTON = By.xpath("//div[@title = 'New']");
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");

    public BasePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    public abstract boolean isPageOpen();

    public boolean isExist(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }
}