package vkedu.autotest.task_2.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import vkedu.autotest.task_2.pages.LoginPage;

public abstract class BaseTest {
  private static String baseURL = "https://ok.ru/";
  public static LoginPage loginPage = new LoginPage();

  @BeforeAll
  public static void setUp() {
    Configuration.baseUrl = baseURL;
  }

  @BeforeEach
  public void setUpEach() {
    loginPage = new LoginPage();
    loginPage.open();
    loginPage.checkPage();
    loginPage.loginAs(LoginPage.login, LoginPage.password);
  }

  @AfterEach
  public void after() {
    Selenide.closeWindow();
  }
}
