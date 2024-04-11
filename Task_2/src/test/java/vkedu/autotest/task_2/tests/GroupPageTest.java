package vkedu.autotest.task_2.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import vkedu.autotest.task_2.pages.BasePage;
import vkedu.autotest.task_2.pages.GroupPage;

@Tag("Functional_test")
public class GroupPageTest extends BaseTest {
  @DisplayName("Проверка вступления в первую группы на странице групп")
  @Test
  public void joinFirstGroupTest() {
    BasePage basePage = new BasePage();
    basePage.goToUserGroups();
    GroupPage groupPage = new GroupPage();
    groupPage.checkPage();
    groupPage.joinFirstGroup();
    Assertions.assertEquals("Вы в группе", groupPage.getResultText(), "Статус не меняется");
    groupPage.unfollowGroup();
  }
}
