package vkedu.autotest.task_1.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import vkedu.autotest.task_1.pages.BasePage;
import vkedu.autotest.task_1.pages.FriendsPage;
import vkedu.autotest.task_1.pages.LoginPage;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FriendsPageTest extends BaseTest{
  private final String friendName = "technopol41";
  @Test
  public void addToFriends() throws InterruptedException {
    loginPage.loginAs(LoginPage.login, LoginPage.password);
    BasePage basePage = new BasePage();
    basePage.goToUserFriends();
    FriendsPage friendsPage = new FriendsPage();
    friendsPage.addFriend(friendName);
  }

  @AfterEach
  public void reset(){
    $(By.xpath(".//button[@aria-label='Запрос отправлен']")).shouldBe(visible).click();
    $(By.xpath("//a[@aria-label='Отменить запрос']")).shouldBe(visible).click();
  }
}
