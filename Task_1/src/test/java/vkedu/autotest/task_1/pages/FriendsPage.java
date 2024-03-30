package vkedu.autotest.task_1.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;


public class FriendsPage extends BasePage{
  public void addFriend(String friendName) throws InterruptedException {
    $(By.xpath(".//input[@type = 'text']")) //Тут поменять text на search и тогда значение слетает
            .setValue(friendName)
            .shouldHave(Condition.value(friendName))
            .pressEnter();
    $(By.xpath(".//div[@class = 'sm__79ad9 __ellipted__79ad9']/..")).click();
    $(By.xpath(".//a[@aria-label='Добавить в друзья']")).click();
    Thread.sleep(5000);
  }

}
