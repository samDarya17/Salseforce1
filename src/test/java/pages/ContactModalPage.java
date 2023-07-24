package pages;

import elements.*;
import models.Account;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage{
    public static final By NEW_CONTACT_TITLE = By.xpath("//h2[contains(@class,'inlineTitle')]");
    public ContactModalPage(WebDriver driver) {
        super(driver);
    }
    public ContactDetailsPage create(Contact contact){
        new Combobox(driver, "Account Name").selectOption(contact.getAccountName());
        new ContactInput(driver, "Last Name").write(contact.getLastName());
        new ContactInput(driver, "First Name").write(contact.getFirstName());
        new ContactInput(driver, "Phone").write(contact.getPhone());
        new ContactInput(driver, "Mobile").write(contact.getMobile());
        new ContactInput(driver, "Email").write(contact.getEmail());
        new ContactInput(driver, "Title").write(contact.getTitle());
        new Button(driver, "Salutation").selectOption(contact.getSalutation());
        new ContactTextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new ContactTextArea(driver, "Other Street").write(contact.getOtherStreet());
        new ContactInput(driver, "Mailing City").write(contact.getMailingCity());
        new ContactInput(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip_PostalCode());
        new ContactInput(driver, "Mailing State/Province").write(contact.getMailingState_Province());
        new ContactInput(driver, "Mailing Country").write(contact.getMailingCountry());
        new ContactInput(driver, "Other City").write(contact.getOtherCity());
        new ContactInput(driver, "Other Zip/Postal Code").write(contact.getOtherZip_PostalCode());
        new ContactInput(driver, "Other State/Province").write(contact.getOtherState_Province());
        new ContactInput(driver, "Other Country").write(contact.getOtherCountry());
        new ContactInput(driver, "Fax").write(contact.getFax());
        new ContactInput(driver, "Home Phone").write(contact.getPhone());
        new ContactInput(driver, "Other Phone").write(contact.getOtherPhone());
        new ContactInput(driver, "Asst. Phone").write(contact.getAsst_Phone());
        new ContactInput(driver, "Assistant").write(contact.getAssistant());
        new ContactInput(driver, "Department").write(contact.getDepartment());
        new Button(driver, "Lead Source").selectOption(contact.getLeadSource());
        new ContactInput(driver, "Birthdate").write(contact.getBirthdate());
        new TextArea(driver, "Description").write(contact.getDescription());
        return clickSaveButton();
    }
    public ContactDetailsPage clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
        return new ContactDetailsPage(driver);
    }


    @Override
    public boolean isPageOpen() {
        return isExist(NEW_CONTACT_TITLE);
    }
}