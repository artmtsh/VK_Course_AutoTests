package vkedu.autotest.task_2.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
  public BasePage() {
    checkPage();
  }

  private static final By PUBLISH_BUTTON = By.xpath("//button[@data-testid='ddm-button']");
  private static final By USER_PAGE = By.xpath("//a[@data-l='t,userPage']");
  private static final By USER_MAIN = By.xpath("//a[@data-l='t,userMain']");
  private static final By HOBBY_PAGE = By.xpath("//a[@data-l='t,hobby']");
  private static final By USERS_FRIENDS_PAGE = By.xpath("//a[@data-l='t,userFriend']");
  private static final By USERS_PHOTOS_PAGE = By.xpath("//a[@data-l='t,userFriend']");
  private static final By USERS_GROUPS_PAGE = By.xpath("//a[@data-l='t,userAltGroup']");
  private static final By GAMES_PAGE = By.xpath("//a[@data-l='t,appsShowcaseHD']");
  private static final By USERS_GIFTS_PAGE = By.xpath("//a[@data-l='t,giftsFront']");
  private static final By RECOMMENDATIONS_PAGE = By.xpath("//a[@data-l='t,discovery']");
  private static final By APPS_PAGE = By.xpath("//a[@data-l='t,bizApps']");
  private static final By DATING_APPS_PAGE = By.xpath("//a[@data-l='t,appsDating']");
  private static final By PROFILE_SETTINGS = By.xpath("//button[@aria-label='Настройки профиля']");
  private static final By LOG_OUT_BUTTON = By.xpath("//a[@data-l='t,logout']");
  private static final By CONFIRM_LOG_OUT_BUTTON = By.xpath("//input[@data-l='t,logout']");

  public void goToPublish() {
    $(PUBLISH_BUTTON).shouldBe(visible).click();
  }

  public void goToUserPage() {
    $(USER_PAGE).shouldBe(visible).click();
  }

  public void goToUserMain() {
    $(USER_MAIN).shouldBe(visible).click();
  }

  public void goTohobby() {
    $(HOBBY_PAGE).shouldBe(visible).click();
  }

  public void goToUserFriends() {
    $(USERS_FRIENDS_PAGE).shouldBe(visible).click();
  }

  public void goToUserPhotos() {
    $(USERS_PHOTOS_PAGE).shouldBe(visible).click();
  }

  public void goToUserGroups() {
    $(USERS_GROUPS_PAGE).shouldBe(visible).click();
  }

  public void goToGames() {
    $(GAMES_PAGE).shouldBe(visible).click();
  }

  public void goToUserGifts() {
    $(USERS_GIFTS_PAGE).shouldBe(visible).click();
  }

  public void goToUserRecommendations() {
    $(RECOMMENDATIONS_PAGE).shouldBe(visible).click();
  }

  public void goToApps() {
    $(APPS_PAGE).shouldBe(visible).click();
  }

  public void goToAppsDating() {
    $(DATING_APPS_PAGE).shouldBe(visible).click();
  }

  public void logOut() {
    $(PROFILE_SETTINGS).shouldBe(visible).click();
    $(LOG_OUT_BUTTON).shouldBe(visible).click();
    $(CONFIRM_LOG_OUT_BUTTON).shouldBe(visible).click();
  }

  public boolean checkUserFriends() {
    return $(USERS_FRIENDS_PAGE).isDisplayed();
  }

  public boolean checkLogOutButton() {
    return $(CONFIRM_LOG_OUT_BUTTON).isDisplayed();
  }

  public void checkPage() {
    $(USER_PAGE).shouldBe(visible);
    $(USER_MAIN).shouldBe(visible);
    $(USER_MAIN).shouldBe(visible);
    $(USERS_FRIENDS_PAGE).shouldBe(visible);
    $(USERS_PHOTOS_PAGE).shouldBe(visible);
  }
}
