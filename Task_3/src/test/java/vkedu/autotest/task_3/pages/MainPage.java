package vkedu.autotest.task_3.pages;

import vkedu.autotest.task_3.wrapper.HeaderInterface;
import vkedu.autotest.task_3.wrapper.LeftMenuInterface;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage implements LeftMenuInterface, HeaderInterface {
  public MainPage(){
    checkPage();
  }
  public static boolean checkUserFriends() {
    return $(USERS_FRIENDS_PAGE).isDisplayed();
  }

  @Override
  public void checkPage() {
    $(USER_PAGE).shouldBe(visible);
    $(USER_MAIN).shouldBe(visible);
    $(USER_MAIN).shouldBe(visible);
    $(USERS_FRIENDS_PAGE).shouldBe(visible);
    $(USERS_PHOTOS_PAGE).shouldBe(visible);
  }
}
