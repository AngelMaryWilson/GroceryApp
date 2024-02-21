package groceryTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPages;

public class HomePageTestCases extends BaseClass {
  @Test 
  public void verifyTheUserInHomePage() {
	  LoginPages ul =new LoginPages(driver);
	  ul.enterUser("admin");
	  ul.enterPassword("admin");
	  ul.loginButton();
	 
	  HomePage hp = new HomePage(driver);
	  String actual = hp.userDetails();
	  String expected ="Admin";
	  Assert.assertEquals(actual, expected);
	  
  }
}
