package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Combobox {
    WebDriver driver;
    String label;
    String combobox = "//label[text()='%s']/ancestor::div[contains(@class,'slds-grid')]//input";
    String optionLocator = "//span[text()='%s']/ancestor::li[contains(@class,'slds-listbox__item')]//lightning-base-combobox-item";
    public Combobox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void selectOption(String option){
        driver.findElement(By.xpath(String.format(combobox,this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator,option))).click();
    }

}