package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactInput {
    WebDriver driver;
    String label;
    String inputLocator = "//label[text()='%s']/ancestor::div[contains(@part,'input-text')]//input";

    public ContactInput(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).clear();
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).sendKeys(text);
    }

}