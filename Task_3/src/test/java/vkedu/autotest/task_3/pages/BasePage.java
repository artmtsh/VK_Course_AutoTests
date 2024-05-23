package vkedu.autotest.task_3.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
  public void checkPage(){}

  public static void open() {
    Selenide.open("/");
  }
}
