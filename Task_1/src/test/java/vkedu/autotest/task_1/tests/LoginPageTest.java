package vkedu.autotest.task_1.tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import vkedu.autotest.task_1.pages.BasePage;
import vkedu.autotest.task_1.pages.LoginPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static vkedu.autotest.task_1.pages.BasePage.PUBLISH_BUTTON;

public class LoginPageTest extends BaseTest{
  LoginPage loginPage = new LoginPage();
  @Test
  public void ValidLoginAndPassword() {
    loginPage.loginAs(LoginPage.login, LoginPage.password);
    Assertions.assertTrue($(By.xpath(PUBLISH_BUTTON)).isDisplayed());
  }
  @Test
  public void InvalidLoginAndPassword() {
    loginPage.loginAs("technopol6P", "technoPasswor");
    Assertions.assertFalse($(By.xpath(PUBLISH_BUTTON)).isDisplayed());
  }

}
