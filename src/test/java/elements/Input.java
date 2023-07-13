package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.DetailsPage;

import static pages.AccountsModalPage.SAVE_BUTTON;

public class Input {
    String inputLocator = "//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//input ";
    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).clear();
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);


    }



    public DetailsPage clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
        return new DetailsPage(driver);
}
}
