package vkedu.autotest.task_1.pages;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

  public final static String login = "technopol63";
  public final static String password = "technopolisPassword";
  public LoginPage open(){
    Selenide.open("/");
    return this;
  }
  private void insertUser(String user){
    $(By.id("field_email")).setValue(user);
  }
  private void insertPassword(String password){
    $(By.id("field_password")).setValue(password);
  }
  public void loginAs(String user, String password){
    insertUser(user);
    insertPassword(password);
    $(By.xpath("//input[@class=\"button-pro __wide\"]")).click();
  }
}
