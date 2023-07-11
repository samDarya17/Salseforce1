package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountsTest extends BaseTest{


    @Test
    public void accountshouldBeCreated(){
        //логин
        loginPage.open()
                .login("dashikasam-rjq4@force.com","vara89083")
                .clickLoginButton();
        //открыть  стр аккаунт
        accountsListPage.open()
                //клик кнопку NEW
        .clickNewButton();
                Account account = new Account("asas","www.onliner.by", "dss");
        //заполнить поля все
                        accountsModalPage.create(account);
        //нажать сохранить



        //проверить создание
        assertEquals(detailsPage.getFieldValue("Account Name"),account.getAccountName());
        assertEquals(detailsPage.getFieldValue("Website"),account.getAccountName());
        assertEquals(detailsPage.getFieldValue("Type"),account.getAccountName());

    }
}
