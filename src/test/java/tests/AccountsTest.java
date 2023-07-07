package tests;

import models.Account;

public class AccountsTest extends BaseTest{

    public void accountshouldBeCreated(){
        //логин
        loginPage.open()
                .login("dashikasam-rjq4@force.com","vara89083")
                .clickLoginButton();
        //открыть  стр аккаунт
        accountsListPage.open()
                //клик кнопку NEW
        .clickNewButton()
                Account account = new Account("","")
        //заполнить поля все
                accountsModalPage.create(account);
        //нажать сохранить

        //проверить создание

    }
}
