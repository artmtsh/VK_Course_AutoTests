package vkedu.autotest.task_3.steps;

import vkedu.autotest.task_3.ValueObject.DefaultUser;
import vkedu.autotest.task_3.pages.LoginPage;

public class LoginSteps {
  private LoginPage loginPage;

  private DefaultUser defaultUser;
  public LoginSteps prepareTest() {
    loginPage = new LoginPage();
    return this;
  }

  public LoginSteps login(String login, String password) {
    loginPage.insertUser(login);
    loginPage.insertPassword(password);
    loginPage.clickLoginButton();
    return this;
  }

  public LoginPage getLoginPage() {
    return loginPage;
  }
}
