package groceryTestcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constans.ErrorMessage;
import elementRepository.HomePage;
import elementRepository.LoginPages;
import utilities.Excel_Read_Program;

public class LoginPagesTestData extends BaseClass{
  @Test 
public void verifyLoginWorkingWithValidUser() throws IOException {
	  
	  LoginPages ul =new LoginPages(driver);
	  ul.enterUser("admin");
	  ul.enterPassword("admin");
	  //ul.enterUser(Excel_Read_Program.getStringdata(0, 1));
	  //ul.enterPassword(Excel_Read_Program.getStringdata(1, 1));
	  ul.loginButton();
	  
	  HomePage hp = new HomePage(driver);
	  String actual = hp.userDetails();
	  String expected ="Admin";
	  Assert.assertEquals(actual, expected, ErrorMessage.errormsgForLogin);
  }
}
