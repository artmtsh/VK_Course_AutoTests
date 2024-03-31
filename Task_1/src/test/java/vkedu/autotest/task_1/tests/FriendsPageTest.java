package vkedu.autotest.task_1.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vkedu.autotest.task_1.pages.BasePage;
import vkedu.autotest.task_1.pages.FriendsPage;
import vkedu.autotest.task_1.pages.LoginPage;
public class FriendsPageTest extends BaseTest{
  private final String friendName = "technopol41";
  @Test
  public void addToFriends() throws InterruptedException {
    loginPage.loginAs(LoginPage.login, LoginPage.password);
    BasePage basePage = new BasePage();
    basePage.goToUserFriends();
    FriendsPage friendsPage = new FriendsPage();
    friendsPage.addFriend(friendName);
    Assertions.assertEquals("Запрос отправлен", friendsPage.getResultText().trim());
    friendsPage.cancelFriendRequest();
  }
}
