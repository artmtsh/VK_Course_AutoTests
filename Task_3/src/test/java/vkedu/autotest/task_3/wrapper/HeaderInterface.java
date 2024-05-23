package vkedu.autotest.task_3.wrapper;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public interface HeaderInterface {
  By TOOLBAR = By.xpath(".//div[@class ='toolbar_decor']");
  By PROFILE_SETTINGS = By.xpath(".//button[@aria-label='Настройки профиля']");
  By LOG_OUT_BUTTON = By.xpath(".//a[@data-l='t,logout']");
  By CONFIRM_LOG_OUT_BUTTON = By.xpath(".//input[@data-l='t,logout']");
  By MESSAGE_BUTTON = By.xpath(".//li[@data-l='t,messages']");
  By DISCUSSION_BUTTON = By.xpath(".//li[@data-l='t,discussions']");
  By NOTIFICATIONS_BUTTON = By.xpath(".//li[@data-l='t,notifications']");
  By GUESTS_BUTTON = By.xpath(".//li[@data-l='t,guests']");
  By MARKS_BUTTON = By.xpath(".//li[@data-l='t,marks']");
  By VIDEO_BUTTON = By.xpath(".//li[@data-l='t,video']");
  By MUSIC_BUTTON = By.xpath(".//li[@data-l='t,music']");
  By OK_LOGO = By.xpath(".//div[@id ='topPanelLeftCorner']");

  default void goToMessages() {
    $(MESSAGE_BUTTON).shouldBe(visible).click();
  }

  default void goToDuscussions() {
    $(DISCUSSION_BUTTON).shouldBe(visible).click();
  }

  default void goToNotifications() {
    $(NOTIFICATIONS_BUTTON).shouldBe(visible).click();
  }

  default void goToGuests() {
    $(GUESTS_BUTTON).shouldBe(visible).click();
  }

  default void goToMarks() {
    $(MARKS_BUTTON).shouldBe(visible).click();
  }

  default void goToVideo() {
    $(VIDEO_BUTTON).shouldBe(visible).click();
  }

  default void goToMusic() {
    $(MUSIC_BUTTON).shouldBe(visible).click();
  }

  default void goToMain(){
    $(OK_LOGO).shouldBe(visible).click();
  }

  default void logOut() {
    $(PROFILE_SETTINGS).shouldBe(visible).click();
    $(LOG_OUT_BUTTON).shouldBe(visible).click();
    $(CONFIRM_LOG_OUT_BUTTON).shouldBe(visible).click();
  }
}
