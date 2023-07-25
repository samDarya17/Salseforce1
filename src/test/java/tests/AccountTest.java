package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest extends BaseTest {
    @Test
    public void accountShouldBeCreated() {
        loginPage.openSaleForce()
                .loginAndPassword("dashikasam-rjq4@force.com", "vara89083")
                .clickLogInButton();
        accountListPage.openAccountPage()
                .clickNewButton();
        Account account = new Account("TestName", "www.onliner.by","Investor","Education","375292118594","357589BY","13","15","Vitebsk","210000","1000000","Belarus","Kaliningrad","7775533","Edinburgh","Scotland","Our product is the best in the world!","London is a capital of Great Britain","I do not know the streets in England");
        accountModalPage.create(account);
        accountDetailsPage.isPageOpen();
        assertEquals(accountDetailsPage.getFieldValue("Account Name"),account.getAccountName());
        assertEquals(accountDetailsPage.getFieldValue("Website"),account.getWebSite());
        assertEquals(accountDetailsPage.getFieldValue("Phone"),account.getPhone());
        assertEquals(accountDetailsPage.getFieldValue("Fax"),account.getFax());
        assertEquals(accountDetailsPage.getFieldValue("Type"),account.getType());
        assertEquals(accountDetailsPage.getFieldValue("Industry"),account.getIndustry());
        assertEquals(accountDetailsPage.getFieldValue("Employees"),account.getEmployees());
        assertEquals(accountDetailsPage.getFieldValue("Annual Revenue"),account.getAnnualRevenue() + " 000 000 000 Br");
        assertEquals(accountDetailsPage.getFieldValue("Description"),account.getDescription());
        assertEquals(accountDetailsPage.getFieldValue("Billing Address"),accountDetailsPage.getBillingAddress(account));
        assertEquals(accountDetailsPage.getFieldValue("Shipping Address"),accountDetailsPage.getShippingAddress(account));
    }
}