package vkedu.autotest.task_1.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
  public void goToUserPage(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[1]/a")).click();
  }
  public void goToUserMain(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[2]/a")).click();
  }
  public void goTohobby(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[3]/a")).click();
  }
  public void goToUserFriends(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[4]/a")).click();
  }
  public void goToUserPhotos(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[5]/a")).click();
  }
  public void goToUserGroups(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[6]/a")).click();
  }
  public void goToGames(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[7]/a")).click();
  }
  public void goToUserGifts(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[8]/a")).click();
  }
  public void goToUserRecommendations(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[9]/a")).click();
  }
  public void goToApps(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[10]/a")).click();
  }
  public void goToAppsDating(){
    $(By.xpath("//div[@id='hook_Block_Navigation']/div/div/div[11]/a")).click();
  }

  public void goToPublish(){
    $(By.xpath("//*[@id='hook_Block_PostingFormDropdown']/posting-form-dropdown/div/button")).click();
  }
  public void logOut(){
    $(By.xpath("//*[@id='hook_Block_ToolbarUserDropdown']/div/button/span")).click();
    $(By.xpath("//div[@id='user-dropdown-menu']/div[1]/div[1]/div[1]/div[2]/a")).click();
    $(By.xpath("//*[@id='hook_FormButton_logoff.confirm_not_decorate']")).click();
  }
}
