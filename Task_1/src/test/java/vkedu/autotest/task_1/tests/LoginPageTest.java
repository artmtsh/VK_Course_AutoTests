package vkedu.autotest.task_1.tests;

import org.junit.jupiter.api.*;
import vkedu.autotest.task_1.pages.LoginPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageTest extends BaseTest{
  LoginPage loginPage = new LoginPage();
  @Test
  public void ValidLoginAndPassword() {
    loginPage.loginAs(LoginPage.login, LoginPage.password);
    $("html").shouldHave(attribute("data-initial-state-id", "userMain"));
  }
  @Test
  public void InvalidLoginAndPassword() {
    loginPage.loginAs("technopol6P", "technoPasswor");
    $("html").shouldHave(attribute("data-initial-state-id", "anonymMain"));
  }

}
