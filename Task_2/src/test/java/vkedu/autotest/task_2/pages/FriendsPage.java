package vkedu.autotest.task_2.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class FriendsPage extends BasePage {
  private static final By FRIENDS_MENU = By.xpath(".//div[@class = 'friends-menu']");
  private static final By SCHOOL_FRIENDS = By.xpath(".//div[@id='hook_Block_SchoolFriendsAdd']");
  private static final By VK_FRIENDS = By.xpath(".//div[@id='hook_Block_VkContactsImport']");
  private static final String SEARCH_BAR = ".//input[@type = 'text']";
  private static final String USER_NAME = ".//div[@class = 'sm__79ad9 __ellipted__79ad9']/..";
  private static final String ADD_TO_FRIENDS_BUTTON = ".//a[@aria-label='Добавить в друзья']";
  private static final String REQUEST_SENT_BUTTON = ".//button[@aria-label='Запрос отправлен']";
  private static final String CANCEL_REQUEST_BUTTON = ".//a[@aria-label='Отменить запрос']";

  public FriendsPage() {
    BasePage basePage = new BasePage();
    basePage.goToUserFriends();
    checkPage();
  }

  @Override
  public void checkPage() {
    $(FRIENDS_MENU).shouldBe(visible);
    $(SCHOOL_FRIENDS).shouldBe(visible);
    $(VK_FRIENDS).shouldBe(visible);
  }

  public void addFriend(String friendName) {
    $(By.xpath(SEARCH_BAR))
            .setValue(friendName)
            .shouldHave(Condition.value(friendName))
            .pressEnter();
    $(By.xpath(USER_NAME)).shouldBe(visible).click();
    $(By.xpath(ADD_TO_FRIENDS_BUTTON)).shouldBe(visible).click();
  }

  public void cancelFriendRequest() {
    $(By.xpath(REQUEST_SENT_BUTTON)).shouldBe(visible).click();
    $(By.xpath(CANCEL_REQUEST_BUTTON)).shouldBe(visible).click();
  }

  public String getResultText() {
    return $(By.xpath("//button[contains(text(),'Запрос отправлен')]")).shouldBe(visible).innerText();
  }
}
