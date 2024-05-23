package vkedu.autotest.task_3.pages;

import org.openqa.selenium.By;
import vkedu.autotest.task_3.wrapper.HeaderInterface;
import vkedu.autotest.task_3.wrapper.LeftMenuInterface;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class FriendsPage extends BasePage implements LeftMenuInterface, HeaderInterface {
  private static final By FRIENDS_MENU = By.xpath(".//nav[@aria-label='Меню в средней колонке']");
  private static final By SCHOOL_FRIENDS = By.xpath(".//a[@aria-label='Школьные друзья']");
  private static final By VK_FRIENDS = By.xpath(".//a[@aria-label='Импорт из ВКонтакте']");
  private static final By REQUEST_SENT_BUTTON = By.xpath(".//button[@aria-label='Запрос отправлен']");
  private static final By CANCEL_REQUEST_BUTTON = By.xpath(".//a[@aria-label='Отменить запрос']");

  public FriendsPage() {
    MainPage mainPage = new MainPage();
    mainPage.goToUserFriends();
    checkPage();
  }

  @Override
  public void checkPage() {
    $(FRIENDS_MENU).shouldBe(visible);
    $(SCHOOL_FRIENDS).shouldBe(visible);
    $(VK_FRIENDS).shouldBe(visible);
  }

  public void cancelFriendRequest() {
    $(REQUEST_SENT_BUTTON)
            .shouldBe(visible)
            .click();
    $(CANCEL_REQUEST_BUTTON)
            .shouldBe(visible)
            .click();
  }

  public String getResultText() {
    return $(REQUEST_SENT_BUTTON)
            .shouldBe(visible)
            .innerText();
  }

}
