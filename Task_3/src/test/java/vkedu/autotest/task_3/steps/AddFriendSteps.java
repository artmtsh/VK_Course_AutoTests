package vkedu.autotest.task_3.steps;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import vkedu.autotest.task_3.pages.FriendsPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AddFriendSteps {


  private static final By SEARCH_BAR = By.xpath(".//input[@type = 'text']");
  private static final By USER_NAME = By.xpath(".//a[contains(@data-l, 'USER_CARD')]");
  private static final By ADD_TO_FRIENDS_BUTTON = By.xpath(".//a[@aria-label='Добавить в друзья']");

  public FriendsPage prepareTest() {
    return new FriendsPage();
  }

  public AddFriendSteps findFriendByName(String friendName){
    $(SEARCH_BAR)
            .setValue(friendName)
            .shouldHave(Condition.value(friendName))
            .pressEnter();
    $(USER_NAME)
            .shouldBe(visible)
            .click();
    return this;
  }

  public AddFriendSteps clickAddButton(){
    $(ADD_TO_FRIENDS_BUTTON)
            .shouldBe(visible)
            .click();
    return this;
  }

}
