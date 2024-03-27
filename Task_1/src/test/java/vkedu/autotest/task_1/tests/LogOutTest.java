package vkedu.autotest.task_1.tests;

import org.junit.jupiter.api.Test;
import vkedu.autotest.task_1.pages.BasePage;
import vkedu.autotest.task_1.pages.LoginPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class LogOutTest extends BaseTest{
  @Test
  public void logOut(){
    loginPage.loginAs(LoginPage.login, LoginPage.password);
    BasePage basePage = new BasePage();
    basePage.logOut();
    $("html").shouldHave(attribute("data-initial-state-id", "anonymMain"));
  }
}
