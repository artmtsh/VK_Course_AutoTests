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
public class InvalidLoginPageTest {
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

  @DisplayName("Проверка авторизации с некорретным логином и паролем")
  @ParameterizedTest
  @CsvFileSource(resources = "/invalidLoginData.csv")
  public void InvalidLoginAndPasswordTest(String login, String password) {
    steps.login(login, password);
    loginPage = steps.getLoginPage();
    Assertions.assertAll(
            "Check if login not successful",
            () -> Assertions.assertTrue(loginPage.checkLoginButton(), "Кнопка авторизации должна быть видна " +
                    "при неуспешной авторизации"),
            () -> Assertions.assertTrue(loginPage.checkEmailField(), "Поле ввода почты должно быть видно " +
                    "при неуспешной авторизации")
    );
  }
}
