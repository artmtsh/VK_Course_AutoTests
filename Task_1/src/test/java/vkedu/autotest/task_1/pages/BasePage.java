package vkedu.autotest.task_1.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
  public static final String PUBLISH_BUTTON = "//button[@data-testid='ddm-button']";
  private static final String USER_PAGE = "//a[@data-l='t,userPage']";
  private static final String USER_MAIN = "//a[@data-l='t,userMain']";
  private static final String HOBBY_PAGE = "//a[@data-l='t,hobby']";
  private static final String USERS_FRIENDS_PAGE = "//a[@data-l='t,userFriend']";
  private static final String USERS_PHOTOS_PAGE = "//a[@data-l='t,userFriend']";
  private static final String USERS_GROUPS_PAGE = "//a[@data-l='t,userAltGroup']";
  private static final String GAMES_PAGE = "//a[@data-l='t,appsShowcaseHD']";
  private static final String USERS_GIFTS_PAGE = "//a[@data-l='t,giftsFront']";
  private static final String RECOMMENDATIONS_PAGE = "//a[@data-l='t,discovery']";
  private static final String APPS_PAGE = "//a[@data-l='t,bizApps']";
  private static final String DATING_APPS_PAGE = "//a[@data-l='t,appsDating']";
  private static final String PROFILE_SETTINGS = "//button[@aria-label='Настройки профиля']";
  private static final String LOG_OUT_BUTTON = "//a[@data-l='t,logout']";
  private static final String CONFIRM_LOG_OUT_BUTTON = "//input[@data-l='t,logout']";
  public void goToPublish(){
    $(By.xpath(PUBLISH_BUTTON)).shouldBe(visible).click();
  }
  public void goToUserPage(){
    $(By.xpath(USER_PAGE)).shouldBe(visible).click();
  }
  public void goToUserMain(){
    $(By.xpath(USER_MAIN)).shouldBe(visible).click();
  }
  public void goTohobby(){
    $(By.xpath(HOBBY_PAGE)).shouldBe(visible).click();
  }
  public void goToUserFriends(){
    $(By.xpath(USERS_FRIENDS_PAGE)).shouldBe(visible).click();
  }
  public void goToUserPhotos(){
    $(By.xpath(USERS_PHOTOS_PAGE)).shouldBe(visible).click();
  }
  public void goToUserGroups(){
    $(By.xpath(USERS_GROUPS_PAGE)).shouldBe(visible).click();
  }
  public void goToGames(){
    $(By.xpath(GAMES_PAGE)).shouldBe(visible).click();
  }
  public void goToUserGifts(){
    $(By.xpath(USERS_GIFTS_PAGE)).shouldBe(visible).click();
  }
  public void goToUserRecommendations(){
    $(By.xpath(RECOMMENDATIONS_PAGE)).shouldBe(visible).click();
  }
  public void goToApps(){
    $(By.xpath(APPS_PAGE)).shouldBe(visible).click();
  }
  public void goToAppsDating(){
    $(By.xpath(DATING_APPS_PAGE)).shouldBe(visible).click();
  }
  public void logOut(){
    $(By.xpath(PROFILE_SETTINGS)).shouldBe(visible).click();
    $(By.xpath(LOG_OUT_BUTTON)).shouldBe(visible).click();
    $(By.xpath(CONFIRM_LOG_OUT_BUTTON)).shouldBe(visible).click();
  }
}
