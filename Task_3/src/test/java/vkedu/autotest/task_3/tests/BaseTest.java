package vkedu.autotest.task_3.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import vkedu.autotest.task_3.ValueObject.DefaultUser;
import vkedu.autotest.task_3.pages.BasePage;
import vkedu.autotest.task_3.pages.LoginPage;
import vkedu.autotest.task_3.pages.MainPage;
import vkedu.autotest.task_3.steps.LoginSteps;

public abstract class BaseTest {
  private static String baseURL = "https://ok.ru/";
  public static LoginPage loginPage;
  private static LoginSteps steps;

  public DefaultUser defaultUser = new DefaultUser();

  @BeforeAll
  public static void setUp() {
    Configuration.baseUrl = baseURL;
  }

  @BeforeEach
  public void setUpEach() {
    BasePage.open();
    steps = new LoginSteps();
    steps
            .prepareTest()
            .login(defaultUser.getLogin(), defaultUser.getPassword());
    loginPage = steps.getLoginPage();
  }

  @AfterEach
  public void after() {
    if (!loginPage.alreadyOnLoginPage()){
      MainPage mainPage = new MainPage();
      mainPage.logOut();
    }
  }

  @AfterAll
  public static void afterAll() {
    Selenide.closeWindow();
  }

}
