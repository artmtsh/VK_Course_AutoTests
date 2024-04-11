package vkedu.autotest.task_2.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import vkedu.autotest.task_2.pages.BasePage;
import vkedu.autotest.task_2.pages.LoginPage;

@Tag("Log_out_test")
public class LogOutTest extends BaseTest {
  @DisplayName("Проверка корретности выхода из аккаунта")
  @Test
  public void logOutTest() {
    BasePage basePage = new BasePage();
    basePage.logOut();
    LoginPage loginPage = new LoginPage();
    loginPage.checkPage();
    Assertions.assertTrue(loginPage.checkLoginButton(), "При выходе из профиля должна быть " +
            "видна кнопка авторизации");
  }
}
