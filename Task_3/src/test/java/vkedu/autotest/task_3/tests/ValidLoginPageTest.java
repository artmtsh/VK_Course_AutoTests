package vkedu.autotest.task_3.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import vkedu.autotest.task_3.pages.BasePage;
import vkedu.autotest.task_3.pages.LoginPage;
import vkedu.autotest.task_3.pages.MainPage;
import vkedu.autotest.task_3.steps.LoginSteps;


@Tag("Functional_test")
public class ValidLoginPageTest {
  private static String baseURL = "https://ok.ru/";
  public static LoginPage loginPage;
  private static final LoginSteps steps = new LoginSteps();

  @BeforeAll
  public static void setUp() {
    Configuration.baseUrl = baseURL;
    BasePage.open();
    steps.prepareTest();
  }

  @AfterEach
  public void after() {
    if (!loginPage.alreadyOnLoginPage()){
      MainPage mainPage = new MainPage();
      mainPage.logOut();
    }
  }

  @DisplayName("Проверка авторизации с корретным логином и паролем")
  @ParameterizedTest
  @CsvFileSource(resources = "/validLoginData.csv")
  public void ValidLoginAndPasswordTest(String login, String password) {
    steps.login(login, password);
    loginPage = steps.getLoginPage();
    Assertions.assertAll(
            "Check if login successful",
            () -> Assertions.assertTrue(MainPage.checkUserFriends(), "Кнопка раздела друзья должна быть видна " +
                    "после авторизации"),
            () -> Assertions.assertFalse(loginPage.checkLoginButton(), "Кнопка авторизации не должна быть " +
                    "видна после авторизации")
    );
  }

}
