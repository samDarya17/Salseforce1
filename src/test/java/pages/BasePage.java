package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    final String URL = "https://samoilenka3.lightning.force.com";
    public static final By NEW_BUTTON = By.xpath("//div[@title = 'New']");

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,20);
    }

    public abstract boolean isPageOpen();

    public boolean isExist(By locator){
        try
        {return driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }
}