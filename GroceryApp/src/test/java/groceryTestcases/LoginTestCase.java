package groceryTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constans.ErrorMessage;
import elementRepository.HomePage;
import elementRepository.LoginPage;
//import utilities.Excel_Read_Program;

public class LoginTestCase extends BaseClass{
  @Test
  public void verifyLoginWorkingWithValidUser() {
	  
	  LoginPage ul =new LoginPage(driver);
	//  ul.enterUser(Excel_Read_Program.getStringdata(0, 0));
	  ul.enterUser("admin");
	  ul.enterPassword("admin");
	  ul.loginButton();
	  
	  HomePage hp = new HomePage(driver);
	  String actual = hp.userDetails();
	  String expected ="Admin";
	  Assert.assertEquals(actual, expected, ErrorMessage.errormsgForLogin);
  }
}

