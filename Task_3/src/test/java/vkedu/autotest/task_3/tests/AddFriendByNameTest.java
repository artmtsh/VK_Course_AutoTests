package vkedu.autotest.task_3.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import vkedu.autotest.task_3.pages.FriendsPage;
import vkedu.autotest.task_3.steps.AddFriendSteps;

@Tag("Functional_test")
public class AddFriendByNameTest extends BaseTest {
  private final String friendName = "technopol41";
  FriendsPage friendsPage;
  private static final AddFriendSteps steps = new AddFriendSteps();


  @DisplayName("Проверка добавления в друзья")
  @Test
  public void addToFriendsListTest() {
    friendsPage = steps.prepareTest();
    steps
            .findFriendByName(friendName)
            .clickAddButton();
    Assertions.assertEquals("Запрос отправлен", friendsPage.getResultText().trim(), "Неверный статус");
    friendsPage.cancelFriendRequest();
  }
}
