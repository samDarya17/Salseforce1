package tests;

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
        //заполнить поля все
                .create("TestName","www.onliner.by/");
        //нажать сохранить

        //проверить создание

    }
}
