package vkedu.autotest.task_1.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vkedu.autotest.task_1.pages.BasePage;
import vkedu.autotest.task_1.pages.GroupPage;
import vkedu.autotest.task_1.pages.LoginPage;

public class GroupPageTest extends BaseTest {
  @Test
  public void joinFirstGroupTest() {
    loginPage.loginAs(LoginPage.login, LoginPage.password);
    BasePage basePage = new BasePage();
    basePage.goToUserGroups();
    GroupPage groupPage = new GroupPage();
    groupPage.joinFirstGroup();
    Assertions.assertEquals("Вы в группе", groupPage.getResultText());
    groupPage.unfollowGroup();
  }
}
