package vkedu.autotest.task_3.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import vkedu.autotest.task_3.pages.LoginPage;
import vkedu.autotest.task_3.pages.MainPage;

@Tag("Log_out_test")
public class LogOutTest extends BaseTest{
  @DisplayName("Проверка корретности выхода из аккаунта")
  @Test
  public void logOutTest() {
    MainPage mainPage = new MainPage();
    mainPage.logOut();
    LoginPage loginPage = new LoginPage();
    loginPage.checkPage();
    Assertions.assertTrue(loginPage.alreadyOnLoginPage(), "При выходе из профиля мы должны быть " +
            "на странице авторизации");
  }
}
