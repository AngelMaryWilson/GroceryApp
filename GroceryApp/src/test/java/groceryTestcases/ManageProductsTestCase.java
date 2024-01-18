package groceryTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constans.ErrorMessage;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.ManageProducts;

public class ManageProductsTestCase extends BaseClass {
  @Test(groups = {"regression"})
  public void verifyEditButtonClick() {
	  
	  
	  LoginPage ul =new LoginPage(driver);
	  ul.enterUser("admin");
	  ul.enterPassword("admin");
	  ul.loginButton();
	  
	  HomePage hp = new HomePage(driver);
	  hp.manageProduct();
	  
	  ManageProducts mp = new ManageProducts(driver);
	  mp.editButton();
	  
	  String actual =mp.textOFeditButton();
	  String expected ="Enter the Tag";
	  Assert.assertEquals(actual, expected, ErrorMessage.errormsgFoInvalidText);
	  
	  
	  String actualsearchButtonText=mp.searchButtonText();
	  String expectedsearchButtonText = "Search";
	  Assert.assertEquals(actualsearchButtonText, expectedsearchButtonText, ErrorMessage.errormsgFoInvalidText);
	  
	  mp.deleteButtonClick();
	  mp.alertAcceptForDelete();
	  
	  
  }
}
