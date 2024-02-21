package groceryTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPages;
import elementRepository.PushNotification;

public class PushNotificationTestCases extends BaseClass {
  @Test
  public void verifyTextofTittleTagElement() {
	  
	  LoginPages ul =new LoginPages(driver);
	  ul.enterUser("admin");
	  ul.enterPassword("admin");
	  ul.loginButton();
	  
	  HomePage hp = new HomePage(driver);
	  hp.manageProduct();
	  hp.pushNotifications();
	  
	  PushNotification pn =new PushNotification(driver);
	  String actualText = pn.textOfTittletag();
	  String expectedText = "";
	  Assert.assertEquals(actualText, expectedText);
  }
  
  @Test 
  public void verifyTextOfDescriptionTagElement() {
	  
	  
	  LoginPages ul =new LoginPages(driver);
	  ul.enterUser("admin");
	  ul.enterPassword("admin");
	  ul.loginButton();
	  
	  HomePage hp = new HomePage(driver);
	  hp.manageProduct();
	  hp.pushNotifications();
	  
	  PushNotification pn =new PushNotification(driver);
	  String actualDescriptionText = pn.textOfDescription();
	  String expectedDescriptionText = "Enter Description";
	  Assert.assertEquals(actualDescriptionText, expectedDescriptionText);
	  
  }
  @Test 
  public void verifyBGcolorOfh3Tag() {
	  
	  LoginPages ul =new LoginPages(driver);
	  ul.enterUser("admin");
	  ul.enterPassword("admin");
	  ul.loginButton();
	  
	  HomePage hp = new HomePage(driver);
	  hp.manageProduct();
	  hp.pushNotifications();
	  
	  PushNotification pn =new PushNotification(driver);
	  String actualBGcolor = pn.bgColorOfH3Tag();
	  String expectedBGcolor = "rgba(0, 0, 0, 0)";
	  Assert.assertEquals(actualBGcolor, expectedBGcolor);
	  
  }
}
