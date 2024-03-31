package vkedu.autotest.task_1.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class FriendsPage extends BasePage{
  private static final String SEARCH_BAR = ".//input[@type = 'text']";
  private static final String USER_NAME = ".//div[@class = 'sm__79ad9 __ellipted__79ad9']/..";
  private static final String ADD_TO_FRIENDS_BUTTON = ".//a[@aria-label='Добавить в друзья']";
  private static final String REQUEST_SENT_BUTTON = ".//button[@aria-label='Запрос отправлен']";
  private static final String CANCEL_REQUEST_BUTTON = ".//a[@aria-label='Отменить запрос']";
  public void addFriend(String friendName) throws InterruptedException {
    $(By.xpath(SEARCH_BAR)) //Тут поменять text на search и тогда значение слетает
            .setValue(friendName)
            .shouldHave(Condition.value(friendName))
            .pressEnter();
    $(By.xpath(USER_NAME)).shouldBe(visible).click();
    $(By.xpath(ADD_TO_FRIENDS_BUTTON)).shouldBe(visible).click();
    Thread.sleep(5000);
  }
  public void cancelFriendRequest(){
    $(By.xpath(REQUEST_SENT_BUTTON)).shouldBe(visible).click();
    $(By.xpath(CANCEL_REQUEST_BUTTON)).shouldBe(visible).click();
  }

  public String getResultText() {
    return $(By.xpath("//button[contains(text(),'Запрос отправлен')]")).shouldBe(visible).innerText();
  }
}
