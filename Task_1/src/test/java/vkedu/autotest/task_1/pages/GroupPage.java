package vkedu.autotest.task_1.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class GroupPage extends BasePage {
  private static final String JOIN_FIRST_GROUP_ON_PAGE_BUTTON = ".//span[contains(text(),'Вступить')]/..";
  private static final String LAST_FOLLOW_GROUP_BUTTON = ".//*[@class = 'scroll-slider_item mr-x']//div[@class='section']";
  private static final String YOU_IN_GROUP_BUTTON = ".//div[@data-l='outlandertarget,join,t,join']";
  private static final String GROUP_JOINED = "//span[contains(text(),'Вы в группе')]";
  public void joinFirstGroup() {
    Throwable exception = null;
    do {
      $(By.xpath(JOIN_FIRST_GROUP_ON_PAGE_BUTTON)).shouldBe(visible).click();
      try {
        getResultText();
        exception = null;
      } catch (Throwable ex){
        exception = ex;
      }
    } while(exception!=null);
  }

  public String getResultText() {
    return $(By.xpath(GROUP_JOINED)).shouldBe(visible).innerText();
  }
  public void unfollowGroup(){
    Selenide.refresh();
    $(By.xpath(LAST_FOLLOW_GROUP_BUTTON))
            .shouldBe(visible)
            .click();
    $(By.xpath(YOU_IN_GROUP_BUTTON))
            .shouldBe(visible)
            .click();
    $(By.xpath(".//div[@class='dropdown_n']"))
            .shouldBe(visible)
            .click();
    $(By.xpath(".//input[@data-l='t,confirm']")).shouldBe(visible).click();
  }
}
