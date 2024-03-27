package vkedu.autotest.task_1.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;


public class FriendsPage extends BasePage{
  public void addFriend(String friendName) throws InterruptedException {
    $(By.xpath("//*[@id='hook_Block_UserFriendsMenu']/div/div/friend-search-input/div/div/div/div[1]/div/label/input")).click();
    Thread.sleep(500); //без этого тест работает нестабильно
    $(By.xpath("//*[@id='hook_Block_UserFriendsMenu']/div/div/friend-search-input/div/div/div/div/div/label/input")).sendKeys(friendName);
    $(By.xpath("//*[@id='hook_Block_UserFriendsMenu']/div/div/friend-search-input/div/div/div/div[1]/div/label/input")).click();
    $(By.xpath("//*[@id='hook_Block_UserFriendsMenu']/div/div/friend-search-input/div/div/div/div[1]/div/label/input")).pressEnter();
    $(By.xpath("//*[@id='searchResults']/div[2]/div/div[1]/div/div[2]/div[1]/div[1]")).click();
    $(By.xpath("//*[@id='hook_Block_MainMenu']/div/ul/li[1]/a")).click();
    $(By.xpath("//*[@id=\"hook_Block_MainMenu\"]/div/ul/li[1]/div/button")).shouldHave(attribute("aria-label","Запрос отправлен"));
  }


}
