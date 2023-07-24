package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactTextArea {
    WebDriver driver;
    String label;
    String textAreaLocator = "//label[text()='%s']/ancestor::div[contains(@class,'slds-form-element__row')]//textarea";

    public ContactTextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(textAreaLocator,this.label))).clear();
        driver.findElement(By.xpath(String.format(textAreaLocator,this.label))).sendKeys(text);
    }
}