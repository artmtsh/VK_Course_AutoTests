package vkedu.autotest.task_1.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import vkedu.autotest.task_1.pages.LoginPage;

public class BaseTest {
  private static String baseURL = "https://ok.ru/";
  public static WebDriver webDriver = new ChromeDriver();
  public static LoginPage loginPage = new LoginPage();
  @BeforeAll
  public static void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    Configuration.baseUrl = baseURL;
  }
  @BeforeEach
  public void setUpEach(){
    loginPage = new LoginPage();
    loginPage.open();
  }
  @AfterEach
  public void after (){
    Selenide.closeWindow();
  }
}
