package vkedu.autotest.task_2.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import vkedu.autotest.task_2.pages.BasePage;
import vkedu.autotest.task_2.pages.LoginPage;
import vkedu.autotest.task_2.pages.MainPage;

public abstract class BaseTest {
  private static String baseURL = "https://ok.ru/";
  public static LoginPage loginPage;

  @BeforeAll
  public static void setUp() {
    Configuration.baseUrl = baseURL;
  }

  @BeforeEach
  public void setUpEach() {
    BasePage.open();
    loginPage = new LoginPage();
    loginPage.checkPage();
    loginPage.insertUser(LoginPage.login);
    loginPage.insertPassword(LoginPage.password);
    loginPage.clickLoginButton();
  }

  @AfterEach
  public void after() {
    Selenide.closeWindow();
  }
}
