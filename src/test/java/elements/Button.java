package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {
    String buttonLocator = "//label[text()='%s']/ancestor::div[contains(@class,'slds-grid')]//button[contains(@class,'slds-combobox__input')]";
    String optionLocator = "//lightning-base-combobox-item[contains(@class, 'slds-media')]//span[text() = '%s']";
    WebDriver driver;
    String label;

    public Button(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void selectOption(String option){
        driver.findElement(By.xpath(String.format(buttonLocator,this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator,option))).click();
    }
}