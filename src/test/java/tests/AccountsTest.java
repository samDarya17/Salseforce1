package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountsTest extends BaseTest{


    @Test
    public void accountshouldBeCreated() {
        boolean isHomePageOpen = loginPage.open()
                .login("dashikasam-rjq4@force.com", "vara89083")
                .clickLoginButton()
                .isPageOpen();
        assertTrue(isHomePageOpen);
        accountsListPage.openAccoutsListPage()
                .clickNewButton();
        Account account = new Account("asas", "102", "103","www.onliner.by");
        accountsModalPage.clickSaveButton();
        boolean isDetailOpen = detailsPage.isPageOpen();

        assertTrue(isDetailOpen);






        assertEquals(detailsPage.getFieldValue("Account Name"),account.getAccountName());
        assertEquals(detailsPage.getFieldValue("Website"),account.getWebSite());
        assertEquals(detailsPage.getFieldValue("Phone"),account.getPhone());
        assertEquals(detailsPage.getFieldValue("Fax"),account.getFax());
        assertEquals(detailsPage.getFieldValue("Type"),account.getType());

    }
    @Test
    public void accountshouldBeCreated01(){
        loginPage.open()
                .login("dashikasam-rjq4@force.com", "vara89083")
        .clickLoginButton();
        accountsListPage.openAccoutsListPage();
        accountsModalPage.openModalPage();
        Account account = new Account("asas", "102", "103","www.onliner.by");
        accountsModalPage.create(account);
        boolean isDetailOpen = detailsPage.isPageOpen();

        assertTrue(isDetailOpen);

    }
    @Test
    public void accountshouldBeCreated02(){
        loginPage.open()
                .login("dashikasam-rjq4@force.com", "vara89083");
                accountsModalPage.openModalPage()
                        .create(new Account("asas", "102", "103","www.onliner.by"));
        accountsModalPage.clickSaveButton();
        boolean isDetailsOpen = detailsPage.isPageOpen();

        assertTrue(isDetailsOpen);

    }



}
