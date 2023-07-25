package tests;

import models.Contact;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContactTest extends BaseTest {
    @Test
    public void contactShouldBeCreated() {
        loginPage.openSaleForce()
                .loginAndPassword("dashikasam-rjq4@force.com", "vara89083")
                .clickLogInButton();
        contactListPage.openContactPage()
                .clickNewButton();
        Contact contact = new Contact("TestName","LastTestName","FirstTestName","Mr.","777333555","375292118594","joj@mail.ru","Best Site","Chkalova","Vitebsk","210000","Vitebsk area","Greece","Neznayu","Athens","87654","Itaka","Brazil","3245873","123456789","987654321","918273645","48","34534","Advertisement","10.03.2009","there are a lot of fields to fill in!");
        contactModalPage.create(contact);
        contactModalPage.isPageOpen();
        assertEquals(contactDetailsPage.getFieldValue("Account Name"),contact.getAccountName());
        assertEquals(contactDetailsPage.getFieldValue("Name"),contactDetailsPage.getName(contact));
        assertEquals(contactDetailsPage.getFieldValue("Title"),contact.getTitle());
        assertEquals(contactDetailsPage.getFieldValue("Phone"),contact.getPhone());
        assertEquals(contactDetailsPage.getFieldValue("Mobile"),contact.getMobile());
        assertEquals(contactDetailsPage.getFieldValue("Email"),contact.getEmail());
        assertEquals(contactDetailsPage.getFieldValue("Mailing Address"),contactDetailsPage.getMailingAddress(contact));
        assertEquals(contactDetailsPage.getFieldValue("Other Address"),contactDetailsPage.getOtherAddress(contact));
        assertEquals(contactDetailsPage.getFieldValue("Fax"),contact.getFax());
        assertEquals(contactDetailsPage.getFieldValue("Home Phone"),contact.getHomePhone());
        assertEquals(contactDetailsPage.getFieldValue("Other Phone"),contact.getOtherPhone());
        assertEquals(contactDetailsPage.getFieldValue("Asst. Phone"),contact.getAsst_Phone());
        assertEquals(contactDetailsPage.getFieldValue("Assistant"),contact.getAssistant());
        assertEquals(contactDetailsPage.getFieldValue("Description"),contact.getDescription());
        assertEquals(contactDetailsPage.getFieldValue("Department"),contact.getDepartment());
        assertEquals(contactDetailsPage.getFieldValue("Lead Source"),contact.getLeadSource());
        assertEquals(contactDetailsPage.getFieldValue("Salutation"),contact.getSalutation());
        assertEquals(contactDetailsPage.getFieldValue("Birthdate"),contact.getBirthdate());
    }
}